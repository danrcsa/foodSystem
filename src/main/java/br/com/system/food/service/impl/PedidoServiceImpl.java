package br.com.system.food.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.system.food.configuration.NaoEncontradoException;
import br.com.system.food.domain.enumerator.StatusPedidoEnum;
import br.com.system.food.domain.pedido.Pedido;
import br.com.system.food.domain.pedido.PedidoProduto;
import br.com.system.food.dto.PedidoDto;
import br.com.system.food.mapper.PedidoMapper;
import br.com.system.food.mapper.PedidoProdutoMapper;
import br.com.system.food.repository.PedidoProdutoRepository;
import br.com.system.food.repository.PedidoRepository;
import br.com.system.food.service.PedidoService;
import br.com.system.food.service.ProdutoService;

@Service
public class PedidoServiceImpl implements PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	@Autowired
	private PedidoMapper mapper;
	
	@Autowired
	ClienteSerciveImpl clienteService;
	
	@Autowired
	PedidoProdutoRepository pedidoProdutoRepo;
	
	@Autowired
	PedidoProdutoMapper pedidoProdutoMapper;
	
	@Autowired
	ProdutoService produtoService;
	
	@Override
	public Pedido recuperarPedido(Long idPedido) {
		try {
			Pedido pedido = repo.findById(idPedido).orElseThrow(NaoEncontradoException::new);
			pedido.setLsPedidoProduto(pedidoProdutoRepo.findByIdPedido(pedido.getIdPedido()));
			pedido.setStatusPedidoEnum(StatusPedidoEnum.getByIdPedidoEnum(pedido.getIdStatusPedido()));
			return pedido;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Pedido criarPedido(PedidoDto dto) {
		dto.getLsPedidoProdutoDto().forEach(pedidoProdutoDto -> 
			dto.setBdValorPedido(dto.getBdValorPedido().add(produtoService.
					recuperarProduto(pedidoProdutoDto.getIdProduto()).getBdValor()))
		);
		dto.setIdStatusPedido(StatusPedidoEnum.PEDIDO_CRIADO.getCodigo());
		Pedido pedido = repo.save(mapper.pedido(dto, clienteService.recuperarClinte(dto.getIdCliente())));
		
		List<PedidoProduto> lsPedidoProduto = (List<PedidoProduto>) pedidoProdutoRepo.saveAll(pedidoProdutoMapper.lsPedidoProduto(
						dto.getLsPedidoProdutoDto(),pedido.getIdPedido()));
		pedido.setLsPedidoProduto(lsPedidoProduto);
		return pedido;
	}

//	@Override
//	public Pedido atualizarPedido(Long idPedido, int idStatusPedido) {
//		return repo.updateIdStatusPedido(idStatus, idPedido);
//	}

	@Override
	public void movimentaPedido(Long idPedido, int idStatusPedido) {
		if(StatusPedidoEnum.getById(idStatusPedido)) {
			repo.updateIdStatusPedido(idPedido, idStatusPedido);
		}
	}

	@Override
	public List<Pedido> recuperarPedidoPorStatus(int idStatusPedido) {
		return repo.findByIdStatusPedido(idStatusPedido);
	}

	@Override
	public List<Pedido> recuperarPedidoAberto() {
		return repo.findByIdStatusPedidoNotIn(StatusPedidoEnum.ENTREGUE.getCodigo());
	}

	@Override
	public void notificarCliente() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pedido atualizarPedido(int idPedido, Long idStatus) {
		// TODO Auto-generated method stub
		return null;
	}

}
