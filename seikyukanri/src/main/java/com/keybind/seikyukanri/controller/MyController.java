package com.keybind.seikyukanri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.keybind.seikyukanri.entity.Shainmaster;
import com.keybind.seikyukanri.repository.Shainrepository;

//
@Controller
public class MyController {
	@Autowired Shainrepository shainmaster;
	
	//接続時にログイン画面を表示させる
	@RequestMapping("/")
	public ModelAndView index(ModelAndView mv) {
		List<Shainmaster> list = shainmaster.findAll();
		mv.addObject("list", list);
		mv.addObject("title","ログイン");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/Password")
	public ModelAndView Passowrd(ModelAndView mv) {
		mv.addObject("title","パスワード変更");
		mv.setViewName("Password");
		return mv;
	}
	//メインメニューを表示させる
	@RequestMapping("/MainMenu")
	public ModelAndView MainMenu(ModelAndView mv) {
		mv.addObject("title", "メインメニュー");
		mv.addObject("h1","メニュー");
		mv.setViewName("MainMenu");
		return mv;
	}
	//契約情報登録を表示する
	@RequestMapping("/KeiyakuEntryMenu")
	public ModelAndView KeiyakuEntryMenu(ModelAndView mv) {
		mv.addObject("title", "契約情報登録");
		mv.setViewName("KeiyakuEntryMenu");
		return mv;
	}
	//見積No検索(edit)を表示させる
	@RequestMapping("/MitunoriNoSearchedit")
	public String MitunoriNoSearchedit(ModelAndView mv) {
		return "redirect:/MitumoriNoSearch" + "?para=edit";
	}
	@GetMapping("/MitumoriNoSearch")
	public ModelAndView mitumori(ModelAndView mv, @RequestParam(name = "para",required = false)String para) {
		if((para).equals("edit")||(para).equals("status")||(para).equals("sanshou")) {
			mv.setViewName("MitumoriNoSearch");
		} 
		return mv;
	}
	//書類選択画面の表示
	@GetMapping("/ShoruiSelect")
	public ModelAndView ShoruiSelect(ModelAndView mv,@RequestParam(name = "para",required = false)String para) {
		if((para).equals("edit")) {
			mv.addObject("title","書類選択(edit)");
			mv.setViewName("ShoruiSelect");
		}else if((para).equals("status")) {
			mv.addObject("title","書類選択");
			mv.addObject("para","status");
			mv.setViewName("ShoruiSelect");
		}
		return mv;
	}
	
	//新規登録ボタン
	@RequestMapping("/Shinki")
	public String shoruientry(ModelAndView mv) {
		return "redirect:/ShoruiEntry" + "?para=entry";
	}
	//照会
	@RequestMapping("/sansho")
	public String sansho(ModelAndView mv) {
		mv.addObject("title", "見積No検索");
		return "redirect:/MitumoriNoSearch" + "?para=sanshou";
	}
	@GetMapping("/ShoruiEntry")
	public ModelAndView ShoruiEntry(ModelAndView mv,@RequestParam(name = "para",required = false)String para) {
		if((para).equals("bpchuumon")) {
			mv.addObject("title","BP向け注文書");
			mv.setViewName("ShoruiEntry");
		}else if((para).equals("bpseikyu")){
			mv.addObject("title","BP向け請求書");
			mv.setViewName("ShoruiEntry");
		}else if((para).equals("entry")||(para).equals("edit")||(para).equals("sanshou")){
			mv.addObject("title", "書類情報登録");
			mv.setViewName("ShoruiEntry");
		}
		return mv;
	}
	
	//bp向け注文書
	@RequestMapping("/ShoruiEntrybpchuumon")
	public String ShoruiEntrybpchuumon(ModelAndView mv) {
		return "redirect:/MitumoriNoSearch" + "?para=bpchuumon";
	}
	//bp向け請求書
	@RequestMapping("/ShoruiEntrybpsikyu")
	public String ShoruiEntrybpseikyu(ModelAndView mv) {
		return "redirect:/MitumoriNoSearch" + "?para=bpseikyu";
	}
	
	//書類授受管理ボタン
	@RequestMapping("/zyuzyukanri")
	public String zyuzyukanri(ModelAndView mv) {
		return "redirect:/MitumoriNoSearch" + "?para=status";
	}
	//入金登録画面
	@RequestMapping("/nyuukin")
	public ModelAndView nyuukin(ModelAndView mv) {
		mv.addObject("title","入金登録");
		mv.setViewName("nyuukin");
		return mv;
	}
	
	//集計表出力
	@RequestMapping("/shuukei")
	public ModelAndView shuukei(ModelAndView mv) {
		mv.addObject("title", "集計表出力");
		mv.setViewName("shuukei");
		return mv;
	}
	//入金管理ボタン
	@RequestMapping("/nyukin")
	public String nyukin(ModelAndView mv) {
		mv.addObject("title", "入金管理");
		mv.setViewName("MitumoriNoSearch");
		return "redirect:/MitumoriNoSearch" + "?para=nyukin";
	}
	//差し戻し画面
	@RequestMapping("/ReasonTorikeshi")
	public ModelAndView ReasonTorikeshi(ModelAndView mv) {
		mv.setViewName("ReasonTorikeshi");
		return mv;
	}
	//検索画面
	@RequestMapping("/Search")
	public ModelAndView Search(ModelAndView mv) {
		mv.setViewName("Search");
		return mv;
	}
	//マスタメニュ
		@RequestMapping("/MasterMenu")
		public ModelAndView MasterMenu(ModelAndView mv) {
			mv.addObject("title", "マスタ管理");
			mv.setViewName("MasterMenu");
			return mv;
		}
		//社員マスタ情報
		@RequestMapping("/syain")
		public String syain(ModelAndView mv) {
			mv.addObject("title", "マスタ情報");
			return "redirect:/MasterJoho" + "?para=syain";
		}
		//取引先マスタ情報
		@RequestMapping("/torihiki")
		public String torihiki(ModelAndView mv) {
		mv.addObject("title","マスタ情報");
		return "redirect:/MasterJoho" + "?para=torihiki";
		}
		//社員、取引先のマスタ情報
		@GetMapping("/MasterJoho")
		public ModelAndView MasterJoho(ModelAndView mv , @RequestParam(name = "para" , required = false)String para) {
			if((para).equals("syain")){
				mv.setViewName("MasterJoho");
				mv.addObject("title", "社員マスタ情報");
			} else if((para).equals("torihiki")){
				mv.setViewName("MasterJoho");
				mv.addObject("title", "取引先マスタ情報");
			}
			return mv;
		}
		
		//社員マスタ登録
		@RequestMapping("/syaintou")
		public String syaintou(ModelAndView mv) {
			return "redirect:/MasterJohoTouroku" + "?para=syain";
		}
		//社員マスタ登録
		@GetMapping("/torihikitou")
		public String torihikitou(ModelAndView mv) {
			return "redirect:/MasterJohoTouroku" + "?para=torihiki";
		}
		
		//社員、取引先のマスタ登録
		@GetMapping("/MasterJohoTouroku")
		public ModelAndView MasterJohoTouroku(ModelAndView mv , @RequestParam(name = "para" , required = false)String para) {
			if((para).equals("syain")){
				mv.setViewName("MasterJohoTouroku");
				mv.addObject("title", "社員マスタ登録");
			} else if((para).equals("torihiki")){
				mv.setViewName("MasterJohoTouroku");
				mv.addObject("title", "取引先マスタ登録");
			}
			return mv;
		}
	
}
