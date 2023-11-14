# language: pt

Funcionalidade: Tela de login

Cenario: <nome_do_cenario>

Dado que o usuario esta na tela de login
Quando preenche username com <usuario> e password com <senha>
E clica no botao LOGIN
Entao deve ter <resultado>

Exemplos:
| nome_do_cenario                                                             | usuario             | senha               | resultado   |
| "Login válido com credenciais corretas"                                     | "standard_user"     | "secret_sauce"      | "sucesso"   |
| "Login invalido com username correto e password errado"                     | "standard_user"     | "secret_saauce"     | "invalido1" |
| "Login invalido com username errado e password correto"                     | "standard_userr"    | "secret_sauce"      | "invalido1" |
| "Login invalido com username correto e password vazio"                      | "standard_user"     | ""                  | "invalido2" |
| "Login invalido com username vazio e password correto"                      | ""                  | "secret_sauce"      | "invalido3" |
| "Login invalido com username vazio e password vazio"                        | ""                  | ""                  | "invalido3" |
| "Login invalido com username espaço em branco e password correto"           | "standard _user"    | "secret_sauce"      | "invalido1" |
| "Login invalido com username correto e password espaço em branco"           | "standard_user"     | " secret_sauce"     | "invalido1" |
| "Login invalido com username espaço em branco e password espaço em branco"  | "standard _user"    | " secret_sauce"     | "invalido1" |
| "Login invalido com username caracteres especiais e password correto"       | "#@!%_@%¨&*()[]"    | "secret_sauce"      | "invalido1" |
