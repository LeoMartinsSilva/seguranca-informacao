(self.webpackChunk_N_E=self.webpackChunk_N_E||[]).push([[788],{3919:function(e,s,t){(window.__NEXT_P=window.__NEXT_P||[]).push(["/cadastro",function(){return t(6632)}])},6632:function(e,s,t){"use strict";t.r(s),t.d(s,{default:function(){return m}});var r=t(5893),o=t(5801),n=t(1664),a=t.n(n),i=t(3105),l=t(5600),u=t(5230),c=t(7294),d=t(7536);let h=new o.Z;function m(){let e=(0,c.useRef)(),{register:s,setError:t,clearErrors:o,formState:{errors:n}}=(0,d.cI)(),[m,p]=(0,c.useState)(""),[g,f]=(0,c.useState)(""),[x,y]=(0,c.useState)(""),j=()=>{(m?g?!x&&(t("senha",{type:"required",message:"O campo senha \xe9 obrigat\xf3rio"},{shouldFocus:!0}),1):(t("nomeDeusuario",{type:"required",message:"O campo nome de usu\xe1rio \xe9 obrigat\xf3rio"},{shouldFocus:!0}),1):(t("nome",{type:"required",message:"O campo nome \xe9 obrigat\xf3rio"},{shouldFocus:!0}),1))||h.inserir({nome:m,nomeDeUsuario:g,senha:x}).then(s=>{e.current.show({severity:"success",summary:"Sucesso",detail:"Usu\xe1rio cadastrado com sucesso"}),console.log(s)}).catch(s=>{e.current.show({severity:"error",summary:"Erro",detail:"Erro ao cadastrar usu\xe1rio"}),console.log(s)})};return(0,r.jsxs)("div",{style:{width:"100%",height:"100vh",display:"flex",alignItems:"center",justifyContent:"center"},children:[(0,r.jsx)(u.F,{ref:e}),(0,r.jsxs)("div",{style:{width:"50%",background:"#eee",borderRadius:10,justifyContent:"center",boxSizing:"border-box",boxShadow:"0 0 10px rgba(0,0,0,0.1)",paddingTop:20,paddingBottom:40,paddingLeft:50,paddingRight:50},children:[(0,r.jsx)("h1",{style:{textAlign:"center"},children:"Cadastro"}),(0,r.jsxs)("form",{style:{display:"flex",flexDirection:"column",rowGap:20},children:[(0,r.jsxs)("div",{style:{display:"flex",flexDirection:"column"},children:[(0,r.jsx)("label",{style:{fontWeight:700},children:"Nome"}),(0,r.jsx)(l.o,{value:m,...s("nome",{onChange:e=>{o("nome"),p(e.target.value)}})}),n.nome&&(0,r.jsx)("small",{style:{color:"red"},children:n.nome.message})]}),(0,r.jsxs)("div",{style:{display:"flex",flexDirection:"column"},children:[(0,r.jsx)("label",{style:{fontWeight:700},children:"Nome de usu\xe1rio"}),(0,r.jsx)(l.o,{value:g,...s("nomeDeUsuario",{onChange:e=>{o("nomeDeUsuario"),f(e.target.value)}})}),n.nomeDeusuario&&(0,r.jsx)("small",{style:{color:"red"},children:n.nomeDeusuario.message})]}),(0,r.jsxs)("div",{style:{display:"flex",flexDirection:"column"},children:[(0,r.jsx)("label",{style:{fontWeight:700},children:"Password"}),(0,r.jsx)(l.o,{type:"password",value:x,...s("senha",{onChange:e=>{o("senha"),y(e.target.value)}})}),n.senha&&(0,r.jsx)("small",{style:{color:"red"},children:n.senha.message})]}),(0,r.jsxs)("div",{style:{display:"flex",flexDirection:"column",alignItems:"center",rowGap:10},children:[(0,r.jsx)(i.z,{label:"Cadastrar",style:{width:"100%"},onClick:e=>{e.preventDefault(),j()}}),(0,r.jsx)(a(),{href:"/login",children:"J\xe1 possui uma conta? Realize o Login"})]})]})]})]})}},5801:function(e,s,t){"use strict";t.d(s,{Z:function(){return o}});var r=t(2166);class o{buscarUsuario(){return new Promise((e,s)=>{r.h.get("/usuario").then(s=>e(s.data)).catch(e=>s(e.response))})}inserir(e){return new Promise((s,t)=>{r.A.post("/usuario/inserir",e).then(e=>s(e.data)).catch(e=>t(e.response))})}atualizar(e){return new Promise((s,t)=>{r.h.put("/usuario/atualizar",e).then(e=>s(e.data)).catch(e=>t(e.response))})}}},2166:function(e,s,t){"use strict";t.d(s,{A:function(){return n},h:function(){return o}});var r=t(7066);let o=r.Z.create({baseURL:"/api",headers:{"Content-Type":"application/json",Authorization:"Bearer ".concat(window.localStorage.getItem("token"))}}),n=r.Z.create({baseURL:"/api",headers:{"Content-Type":"application/json"}});o.interceptors.request.use(e=>{let s=window.localStorage.getItem("token");return s&&(e.headers.Authorization="Bearer ".concat(s)),e},e=>Promise.reject(e))}},function(e){e.O(0,[728,536,888,774,179],function(){return e(e.s=3919)}),_N_E=e.O()}]);