(self.webpackChunk_N_E=self.webpackChunk_N_E||[]).push([[247],{1014:function(e,t,s){(window.__NEXT_P=window.__NEXT_P||[]).push(["/editarUsuario",function(){return s(810)}])},810:function(e,t,s){"use strict";s.r(t),s.d(t,{default:function(){return h}});var o=s(5893),r=s(5801);s(1664);var n=s(1163),a=s(3105),i=s(5600),l=s(5230),u=s(7294),c=s(7536);let d=new r.Z;function h(){let e=(0,n.useRouter)(),t=(0,u.useRef)(),{register:s,setError:r,clearErrors:h,formState:{errors:m}}=(0,c.cI)(),[p,g]=(0,u.useState)(null),[f,x]=(0,u.useState)(""),[y,w]=(0,u.useState)(""),[j,v]=(0,u.useState)("");(0,u.useEffect)(()=>{console.log("buscando usu\xe1rio"),d.buscarUsuario().then(t=>{t?(g(t.id),x(t.nome),w(t.nomeDeUsuario)):e.push("/login")}).catch(e=>{console.log(e)})},[]);let b=()=>{(f?y?!j&&(r("senha",{type:"required",message:"O campo senha \xe9 obrigat\xf3rio"},{shouldFocus:!0}),1):(r("nomeDeusuario",{type:"required",message:"O campo nome de usu\xe1rio \xe9 obrigat\xf3rio"},{shouldFocus:!0}),1):(r("nome",{type:"required",message:"O campo nome \xe9 obrigat\xf3rio"},{shouldFocus:!0}),1))||d.atualizar({id:p,nome:f,nomeDeUsuario:y,senha:j}).then(e=>{t.current.show({severity:"success",summary:"Sucesso",detail:"Usu\xe1rio cadastrado com sucesso"}),console.log(e)}).catch(e=>{t.current.show({severity:"error",summary:"Erro",detail:"Erro ao cadastrar usu\xe1rio"}),console.log(e)})};return(0,o.jsxs)("div",{style:{width:"100%",height:"100vh",display:"flex",alignItems:"center",justifyContent:"center"},children:[(0,o.jsx)(l.F,{ref:t}),(0,o.jsxs)("div",{style:{width:"50%",background:"#eee",borderRadius:10,justifyContent:"center",boxSizing:"border-box",boxShadow:"0 0 10px rgba(0,0,0,0.1)",paddingTop:20,paddingBottom:40,paddingLeft:50,paddingRight:50},children:[(0,o.jsx)("h1",{style:{textAlign:"center"},children:"Editar usu\xe1rio"}),(0,o.jsxs)("form",{style:{display:"flex",flexDirection:"column",rowGap:20},children:[(0,o.jsxs)("div",{style:{display:"flex",flexDirection:"column"},children:[(0,o.jsx)("label",{style:{fontWeight:700},children:"Nome"}),(0,o.jsx)(i.o,{value:f,...s("nome",{onChange:e=>{h("nome"),x(e.target.value)}})}),m.nome&&(0,o.jsx)("small",{style:{color:"red"},children:m.nome.message})]}),(0,o.jsxs)("div",{style:{display:"flex",flexDirection:"column"},children:[(0,o.jsx)("label",{style:{fontWeight:700},children:"Nome de usu\xe1rio"}),(0,o.jsx)(i.o,{value:y,...s("nomeDeUsuario",{onChange:e=>{h("nomeDeUsuario"),w(e.target.value)}})}),m.nomeDeusuario&&(0,o.jsx)("small",{style:{color:"red"},children:m.nomeDeusuario.message})]}),(0,o.jsxs)("div",{style:{display:"flex",flexDirection:"column"},children:[(0,o.jsx)("label",{style:{fontWeight:700},children:"Password"}),(0,o.jsx)(i.o,{type:"password",value:j,...s("senha",{onChange:e=>{h("senha"),v(e.target.value)}})}),m.senha&&(0,o.jsx)("small",{style:{color:"red"},children:m.senha.message})]}),(0,o.jsxs)("div",{style:{display:"flex",flexDirection:"column",alignItems:"center",rowGap:10},children:[(0,o.jsx)(a.z,{label:"Editar",style:{width:"100%"},onClick:e=>{e.preventDefault(),b()}}),(0,o.jsx)(a.z,{label:"Sair",outlined:!0,style:{width:"100%"},severity:"danger",onClick:t=>{t.preventDefault(),window.localStorage.removeItem("token"),e.push("/login")}})]})]})]})]})}},5801:function(e,t,s){"use strict";s.d(t,{Z:function(){return r}});var o=s(2166);class r{buscarUsuario(){return new Promise((e,t)=>{o.h.get("/usuario").then(t=>e(t.data)).catch(e=>t(e.response))})}inserir(e){return new Promise((t,s)=>{o.A.post("/usuario/inserir",e).then(e=>t(e.data)).catch(e=>s(e.response))})}atualizar(e){return new Promise((t,s)=>{o.h.put("/usuario/atualizar",e).then(e=>t(e.data)).catch(e=>s(e.response))})}}},2166:function(e,t,s){"use strict";s.d(t,{A:function(){return n},h:function(){return r}});var o=s(7066);let r=o.Z.create({baseURL:"/api",headers:{"Content-Type":"application/json",Authorization:"Bearer ".concat(window.localStorage.getItem("token"))}}),n=o.Z.create({baseURL:"/api",headers:{"Content-Type":"application/json"}});r.interceptors.request.use(e=>{let t=window.localStorage.getItem("token");return t&&(e.headers.Authorization="Bearer ".concat(t)),e},e=>Promise.reject(e))},1163:function(e,t,s){e.exports=s(9090)}},function(e){e.O(0,[728,536,888,774,179],function(){return e(e.s=1014)}),_N_E=e.O()}]);