package mz.ac.covid.app.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import mz.ac.covid.app.boot.domain.Instituicao;
import mz.ac.covid.app.boot.domain.ListaVacinacao;
import mz.ac.covid.app.boot.domain.Sala;
import mz.ac.covid.app.boot.service.InstituicaoService;
import mz.ac.covid.app.boot.service.ListaVacinacaoService;
import mz.ac.covid.app.boot.service.SalaService;

@Controller
@RequestMapping("/vacinacoes")
public class ListaVacinacaoController {

  @Autowired
  private ListaVacinacaoService listaVacinacaoService;

  @Autowired
  private InstituicaoService instituicaoService;

  @Autowired
  private SalaService salaService;

  @GetMapping("cadastrar")
  public String cadastrar(ListaVacinacao listaVacinacao) {

    return "/admin/pages/lista-vacinacoes/add-lista";
  }

  @GetMapping("listar")
  public String listar(ModelMap model) {
    model.addAttribute("listavacinacoes", listaVacinacaoService.pesquisarTodos());
    return "/admin/pages/lista-vacinacoes/list-vacinacao";
  }

  /**
   * Metodo para listar todos os instituicoes e mostrar na combobox presente no
   * formulario
   * 
   * @return
   */
  @ModelAttribute("instituicoes")
  public List<Instituicao> listaInstituicoes() {
    return instituicaoService.pesquisarTodos();
  }

  /**
   * Metodo para listar todas as salas e mostrar na combobox presente no
   * formulario
   * 
   * @return
   */
  @ModelAttribute("salas")
  public List<Sala> listaSalas() {
    return salaService.buscarTodos();
  }

}
