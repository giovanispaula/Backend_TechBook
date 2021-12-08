package com.techbook.techbook.config;

import com.techbook.techbook.entities.*;
import com.techbook.techbook.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
@Configuration
public class Config implements CommandLineRunner {

    @Autowired
    private IProfileRepository profileRepository;

    @Autowired
    private IBookRepository bookRepository;

    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public void run(String...args) throws Exception {

        profileRepository.save(new Profile("Giovani Silva", "https://github.com/giovanispaula", "https://www.linkedin.com/in/giovanispaula/", "", "giovannispaula@gmail.com", ""));
        profileRepository.save(new Profile("Marcos Spano", "https://github.com/marcosspano", "", "", "e.marcosspano@gmail.com", ""));
        profileRepository.save(new Profile("Nathalia Vieira", "https://github.com/nathsilvavieira", "https://www.linkedin.com/in/nathalia-vieira93/", "", "naahviera@gmail.com", ""));
        profileRepository.save(new Profile("Túlio Xavier", "https://github.com/tuliopxavier", "", "", "tuliopxavier@gmail.com", ""));

        categoryRepository.save(new Category("TECNOLOGIA", "Tecnologia"));
        categoryRepository.save(new Category("DIREITO", "Direito"));
        categoryRepository.save(new Category("FICCAO", "Ficção"));
        categoryRepository.save(new Category("MEDICINA", "Medicina"));
        categoryRepository.save(new Category("LITERATURABRASILEIRA", "Literatura Brasileira"));
        categoryRepository.save(new Category("ROMANCE", "Romance"));
        categoryRepository.save(new Category("INFANTIL", "Infantil"));
        categoryRepository.save(new Category("POESIA", "Poesia"));
        categoryRepository.save(new Category("SUSPENSE", "Suspense"));
        categoryRepository.save(new Category("FANTASIA", "Fantasia"));
        categoryRepository.save(new Category("ARTES", "Artes"));
        categoryRepository.save(new Category("FILOSOFIA", "Filosofia"));
        categoryRepository.save(new Category("IDIOMAS", "Idiomas"));
        categoryRepository.save(new Category("CINEMA", "Cinema"));
        categoryRepository.save(new Category("PEDAGOGIA", "Pedagogia"));
        categoryRepository.save(new Category("SAUDE", "Saúde"));
        categoryRepository.save(new Category("PSICOLOGIA", "Psicologia"));
        categoryRepository.save(new Category("POLITICA", "Política"));
        categoryRepository.save(new Category("MODA", "Moda"));
        categoryRepository.save(new Category("TURISMO", "Turismo"));
        categoryRepository.save(new Category("SOCIOLOGIA", "Sociologia"));
        categoryRepository.save(new Category("ENCICLOPEDIAS", "Enciclopédias"));
        categoryRepository.save(new Category("ECONOMIA", "Economia"));
        categoryRepository.save(new Category("BIOLOGIA", "Biologia"));
        categoryRepository.save(new Category("ASTRONOMIA", "Astronomia"));
        categoryRepository.save(new Category("BOTANICA", "Botânica"));
        categoryRepository.save(new Category("ARQUEOLOGIA", "Arqueologia"));
        categoryRepository.save(new Category("CULINARIA", "Culinária"));
        categoryRepository.save(new Category("ASTROLOGIA", "Astrologia"));

        // - Tecnologia (01)
        bookRepository.save(new Book(
                "Banco De Dados - Projetos E Implementação",
                70.28,
                "Com uma apresentação diferenciada, utilizando metodologia e conceitos embasados na execução prática de projetos de banco de dados, o livro explica como projetar um banco de dados e sistemas, como criar aplicações utilizando Bancos de dados, praticar a gestão após a implementação e manter a base de dados corporativas em uma empresa.Destaca aspectos conceituais, a orientação à gestão de negócios e aborda a utilização de álgebra relacional, mapeamento OO -> ER no projeto de banco de dados, comandos básicos da linguagem SQL ANSI, explanados com exemplos e estudos de caso.A quarta edição traz as alterações para Microsoft SQL 2017, avanços em SQL e Oracle, também conta com um novo capítulo sobre Administração de dados a gestão de Modelos. Com este capítulo, encerramos o contexto de projeto e a implementação de bancos de dados, com a apresentação da última atividade do ciclo de desenvolvimento de bancos de dados, garantindo a integridade corporativa e mantendo a consistência dos dados de uma organização.",
                "https://images-na.ssl-images-amazon.com/images/I/71PO8Ty2DiL.jpg",
                categoryRepository.getById(1)));

        bookRepository.save(new Book(
                "Java®: Como Programar",
                767.00,
                "Milhões de alunos e profissionais aprenderam programação e desenvolvimento de software com os livros Deitel®. Java: como programar, 10ª edição, fornece uma introdução clara, simples, envolvente e divertida à programação Java com ênfase inicial em objetos. Destaques incluem: rica cobertura dos fundamentos com exemplos reais; apresentação com ênfase inicial em classes e objetos; uso com Java™ SE 7, Java™ SE 8 ou ambos; Java™ SE 8 abordado em seções modulares opcionais; lambdas, fluxos e interfaces funcionais usando métodos padrão e estáticos do Java SE 8; Swing e GUI do JavaFX: elementos gráficos e multimídia; conjunto de exercícios \"\"Fazendo a diferença\"\"; tratamento de exceções integrado; arquivos, fluxos e serialização de objetos; concorrência para melhor desempenho com multiprocessamento; o livro contém o conteúdo principal para cursos introdutórios; outros tópicos: recursão, pesquisa, classificação, coleções genéricas, estruturas de dados, multithreading, banco de dados (JDBC ™ e JPA).",
                "https://images-na.ssl-images-amazon.com/images/I/81jdJ94mSbL.jpg",
                categoryRepository.getById(1)));

        bookRepository.save(new Book(
                "Usando Docker: Desenvolvendo e Implantando Software com Contêineres",
                157.00,
                "Os contêineres do Docker oferecem métodos simples, rápidos e robustos para o desenvolvimento, a distribuição e a execução de softwares, principalmente em ambientes dinâmicos e distribuídos. Com este guia prático, você aprenderá por que os contêineres são tão importantes, o que a adoção do Docker oferece e como torná-lo parte de seu processo de desenvolvimento. Ideal para desenvolvedores, engenheiros de operações e administradores de sistemas – especialmente os inclinados a adotar uma abordagem DevOps – Usando Docker parte dos aspectos básicos e vai até a execução de vários contêineres em um sistema multi-host com rede e agendamento. O objetivo do livro é guiá-lo pelas etapas necessárias para desenvolver, testar e implantar um aplicativo web com o Docker. Comece a usar o Docker construindo e implantando um aplicativo web simples. Use técnicas de Implantação Contínua para levar seu aplicativo para o ambiente de produção muitas vezes ao dia. Conheça várias opções e técnicas para o registro e o monitoramento de múltiplos contêineres. Examine a descoberta de rede e de serviços: como os contêineres encontrarão uns aos outros e como conectá-los? Orquestre e agrupe os contêineres para cuidar do balanceamento de carga, escalonamento, failover e agendamento. Proteja seu sistema seguindo os princípios da defesa em profundidade e do privilégio mínimo.",
                "https://images-na.ssl-images-amazon.com/images/I/71tnxPlYiwL.jpg",
                categoryRepository.getById(1)));

        bookRepository.save(new Book(
                "React - Aprenda Praticando: Desenvolva Aplicações web Reais com uso da Biblioteca React e de Seus Módulos Auxiliares",
                69.00,
                "React é uma biblioteca para a criação de sites, interfaces gráficas e aplicações web, criada pelo Facebook, e seu uso tem crescido muito, sendo usada por grandes empresas, como Netflix, Walmart e The New York Times. Neste livro, eminentemente prático, Maujor, com sua reconhecida didática, fornece ao leitor uma visão detalhada dos conceitos básicos e recursos da biblioteca React. Você aprenderá a desenvolver aplicativos React completos, passo a passo, desde o zero até a hospedagem em um servidor remoto. Cada capítulo apresenta um novo recurso do React, com exercícios práticos para consolidar os conceitos estudados. Destina-se a desenvolvedores com conhecimentos básicos de HTML, CSS3 e JavaScript, interessados na criação de sites tanto na área de design quanto na de desenvolvimento e programação. O livro também poderá ser útil como material de referência do React. A estrutura de pastas dos projetos desenvolvidos no livro encontra-se em https://github.com/Maujor/livro-react e o respectivo material de apoio aos projetos está disponível no site do livro em https://kwz.me/h1m.",
                "https://images-na.ssl-images-amazon.com/images/I/61FPdlI0U2L.jpg",
                categoryRepository.getById(1)));

        bookRepository.save(new Book(
                "Kubernetes Básico: Mergulhe no Futuro da Infraestrutura",
                60.83,
                "O Kubernetes veio para ficar. Em apenas cinco anos, esse orquestrador de contêineres mudou radicalmente o modo como os desenvolvedores e o pessoal de operações fazem o desenvolvimento, a implantação e a manutenção de aplicações na nuvem. A edição atualizada deste livro popular explica como o Kubernetes pode ajudar sua empresa a atingir novos patamares de velocidade, agilidade, confiabilidade e eficiência – não importa se os sistemas distribuídos são uma novidade para você ou se você já vem implantando aplicações nativas de nuvem há algum tempo. Brendan Burns, Joe Beda e Kelsey Hightower – todos com participação ativa na conceitualização e no desenvolvimento do Kubernetes desde o princípio – mostram como esse sistema está presente no ciclo de vida de uma aplicação distribuída. Você aprenderá a usar ferramentas e APIs para automatizar sistemas distribuídos escaláveis para serviços online, aplicações de machine learning ou até mesmo para um cluster de computadores Raspberry Pi.",
                "https://images-na.ssl-images-amazon.com/images/I/41cIxu9yEWL.jpg",
                categoryRepository.getById(1)));

        // - Direito (02)
        bookRepository.save(new Book(
                "O Dever do Advogado",
                12.00,
                "Esta obra constitui uma resposta de Ruy Barbosa, que muito realizou pela política e pelo direito deste país, a uma consulta feita pelo amigo de profissão e correligionário Evaristo de Morais, através de uma carta, acerca de uma possível defesa de um caso de homicídio. O cliente, porém, acusado de assassinar a esposa por motivo de adultério, era também adversário político de ambos.",
                "https://images-na.ssl-images-amazon.com/images/I/616KaagFgyL.jpg",
                categoryRepository.getById(2)));

        bookRepository.save(new Book(
                "Direito Civil - Direito das Coisas - Vol. 4: Volume 4",
                157.46,
                "“Em meio a tantas transformações por que passam as relações jurídicas de Direito Privado, o Direito das Coisas talvez seja o mais instigante, por atrair aspectos a um só tempo dogmáticos e ideológicos, a suscitar mecanismos de permanente conflito de interesses, no que tange ao aproveitamento dos bens, entre a tutela patrimonial (propriedade como garantia) e a concretização de direitos fundamentais (propriedade como acesso). A sistematização da matéria, permeada por núcleos normativos, não raro conflitantes, exige reconstrução teóricade elevado grau de dificuldade. A tal desafio se lança o Professor Flávio Tartuce, nesta edição do Volume 4 de sua já consagrada obra dedicada ao Direito Privado Brasileiro.O livro encontra-se organizado em nove capítulos, dedicados aos principais institutos dos Direitos Reais e às suas principais controvérsias doutrinárias e jurisprudenciais. (...)Na esteira das edições anteriores, Flávio Tartuce, nacionalmente conhecido por sua intensa atividade docente, consegue tratar de forma didática dos intrincados problemas que, de maneira arguta, identifica e analisa, oferecendo ao leitor, em boa hora, subsídios teóricose práticos para a compreensão e a construção do direito vivo.”Gustavo Tepedino_____________________________________________“Recomendo o Volume 4 de Direito Civil – Direito das Coisas, do Prof. Tartuce, em razão de ser uma obra que conjuga as questões teóricas aplicadas aos casos concretos, justamente por analisar criticamente os julgados brasileiros em cada tema tratado, harmonizando teoria e prática em um só livro.”Pablo Malheiros da Cunha FrotaProfessor de Direito Civil da Universidade Federal de Goiás? ",
                "https://images-na.ssl-images-amazon.com/images/I/71MYZLzeSUL.jpg",
                categoryRepository.getById(2)));

        bookRepository.save(new Book(
                "Manual de Direito Civil - Volume Único",
                184.96,
                "Este Manual de Direito Civil pretende, desde a sua primeira edição, suprir as necessidades dos operadores do Direito Privado em geral. É direcionado a todos os seus aplicadores: juízes, promotores, procuradores, advogados, professores, alunos de graduação e de pós-graduação, bem como àqueles que se preparam para provas oficiais e concursos para a carreira jurídica. De fato, nos últimos anos, a obra tem atendido a esse fim, sendo adotada por alunos dos mais diversos níveis de ensino jurídico no Brasil; utilizada por procuradores, defensores e advogados para fundamentar suas peças; e instrumento de julgadores, inclusive de Tribunais Superiores, com o intuito de motivar suas decisões.O trabalho condensa os principais posicionamentos do autor a respeito das categorias jurídicas, expondo as doutrinas clássica e contemporânea. Traz também comentários sobre todos os enunciados doutrinários aprovados nas Jornadas de Direito Civil, eventos históricos promovidos pelo Conselho da Justiça Federal e pelo Superior Tribunal de Justiça entre os anos de 2002 e 2018, dos quais o autor participou. Tais exposições vêm acompanhadas dos entendimentos sumulados e ementados pelos tribunais brasileiros, notadamente da mais recente jurisprudência superior. Há um destaque especial para os julgados constantes dos Informativos de Jurisprudência e da ferramenta Jurisprudência em Teses, ambos do Superior Tribunal de Justiça.O livro apresenta enfoque interdisciplinar e multicultural, com interações com outros ramos jurídicos, como o Direito Constitucional e o Direito do Consumidor. Também está atualizado de acordo com as principais modificações promovidas pelo atual Código de Processo Civil e pelo Estatuto da Pessoa com Deficiência, sem prejuízo de outras leis de notável impacto para o Direito Privado.Estão expostas as grandes teses do Direito Civil Contemporâneo, tais como a teoria do diálogo das fontes, o Direito Civil Constitucional, os princípios do Código Civil de 2002, a eficácia horizontal dos direitos fundamentais, a técnica de ponderação, as eficácias interna e externa da função social do contrato, os conceitos parcelares da boa-fé objetiva (supressio, surrectio, tu quoque, exceptio doli, venire contra factum proprium, duty to mitigate the loss e Nachfrist), a visão contemporânea da responsabilidade civil e do inadimplemento obrigacional, a função social da posse, a função social e socioambiental da propriedade, as novas entidades familiares, a parentalidade socioafetiva, a multiparentalidade, as principais controvérsias da sucessão legítima, entre outras.A partir da edição 2020, este livro passou a trazer reflexões teóricas e práticas a respeito da grave crise decorrente da pandemia de Covid-19, e seus impactos para todo o Direito Privado. Nota-se, assim, uma interação contínua entre teoria e prática, entre as categorias da civilística contemporânea e a sua efetividade. ?",
                "https://images-na.ssl-images-amazon.com/images/I/815ofVwz+xL.jpg",
                categoryRepository.getById(2)));

        bookRepository.save(new Book(
                "Os Onze: O STF, seus bastidores e suas crises",
                35.09,
                "Desde o julgamento da ação penal 470, mais conhecida como Mensalão, o Supremo Tribunal Federal viu-se no centro do debate nacional. Seus integrantes se tornaram amplamente conhecidos e, também por isso, passaram a usar a opinião pública como fundamento para seus votos. Nos turbulentos anos de uma das maiores crises políticas e econômicas que o país já viveu, o protagonismo a que foi alçado o tribunal criou um conjunto novo de desafios. O jornalista Felipe Recondo, especialista na cobertura do STF, acompanha e analisa o cotidiano do Supremo há mais de uma década. Luiz Weber estuda o funcionamento do tribunal e analisa os movimentos e forças políticas que interagem com o STF. Ao longo de anos, os dois realizaram centenas de entrevistas para escrever Os onze: o STF, seus bastidores e suas crises. O livro traz histórias que permitem descrever os contornos, causas e consequências dos grandes casos que envolveram o tribunal, incluindo o recente e polêmico inquérito sobre fake news aberto por Dias Toffoli e comandado por Alexandre de Moraes. Onze é o número de ministros do Supremo, que atuam como “onze ilhas”. A expressão foi cunhada pelo ex-ministro do STF Sepúlveda Pertence e se consolidou como chave de interpretação para o funcionamento do tribunal, com a proliferação de decisões monocráticas e a sucessão de embates internos. Num momento em que o STF se vê sob o ataque de expoentes do governo federal e de militantes nas redes sociais, entender as dinâmicas da última instância do poder judiciário é mais importante do que nunca.",
                "https://images-na.ssl-images-amazon.com/images/I/81-+bsk+68L.jpg",
                categoryRepository.getById(2)));

        bookRepository.save(new Book(
                "VADE MECUM POLICIAL - LEGISLAÇÃO SELECIONADA PARA CARREIRAS POLICIAIS - 10ª ED - 2021",
                193.86,
                "Seja muito bem-vindo à 10ª Edição do VADE MECUM POLICIAL! Após o sucesso das quatro primeiras edições, que se esgotaram, apresentamos esta, ainda mais completa e focada nos concursos policiais. Como professor de cursos preparatórios para concursos públicos desde o ano de 2002, percebemos claramente a cobrança cada vez mais específica e relacionada ao cargo pretendido. É a chamada pertinência temática. Neste sentido, inicia-se a busca pela melhor preparação possível, devendo o candidato frequentar cursos, ler doutrina e jurisprudência direcionadas e, claro, ter acesso à vasta legislação exigida pelos editais. É o que naturalmente ocorre também no âmbito das carreiras policiais, a exemplo de Delegado de Polícia, Agente, Investigador, Escrivão, Papiloscopista, Perito Criminal, Policial Rodoviário Federal, Oficial ou Soldado das Polícias Militares. A preparação para tais concursos envolve o acesso a legislação específica, confecção de peças de polícia judiciária, testes de aptidão física, exames médicos rigorosos, investigação social, aprovação em cursos de formação promovidos por academias de polícia entre outros desafios. Com o objetivo de atender aos seus anseios em busca do objetivo final, as principais leis exigidas nos concursos policiais foram reunidas e sistematizadas por uma experiente equipe de professores. Elaboramos uma criteriosa remissão de artigos e súmulas a fim de facilitar os estudos de nosso futuro colega policial: você! Foi desta forma que criamos o produto que agora tem em suas mãos e que certamente colaborará não apenas em sua jornada como candidato, mas também no exercício da nobre profissão de policial. Aos estudos! Bruno Zampier",
                "https://images-na.ssl-images-amazon.com/images/I/51ycgUE1htS.jpg",
                categoryRepository.getById(2)));

        // - Ficção (03)
        bookRepository.save(new Book(
                "A Máquina do Tempo: Uma Invenção",
                22.99,
                "Publicado em 1895, A Máquina do Tempo é considerado um dos primeiros romances a tratar do conceito de viagem no tempo. O personagem central, um cientista apresentado na trama apenas como o Viajante do Tempo, constrói uma máquina capaz de viajar pela quarta dimensão. Ao testá-la, é transportado para o ano de 802.701, em um mundo povoado pelos pacíficos elóis. Mas os elóis não são os únicos habitantes dessa nova Terra, e o Viajante do Tempo terá de enfrentar os morlocks, seres que vivem nos subterrâneos e guardam um importante segredo sobre o destino da humanidade. A Máquina do Tempo foi o primeiro romance publicado por H. G. Wells. Seu sucesso instantâneo na época abriu as portas para todo um novo gênero literário que até hoje agrada a leitores de todas as idades.",
                "https://images-na.ssl-images-amazon.com/images/I/71cL9wegDQL.jpg",
                categoryRepository.getById(3)));

        bookRepository.save(new Book(
                "Trono destruído: Coletânea definitiva da série A Rainha Vermelha",
                33.53,
                "Nesta coletânea, que encerra a série A Rainha Vermelha, você vai descobrir mais sobre o universo avassalador da saga que já vendeu mais de meio milhão de exemplares no Brasil. Trono destruído é uma coletânea essencial para todos os leitores da série best-seller de Victoria Aveyard que ficaram com vontade de passar mais tempo com os personagens depois do fim de Tempestade de guerra. Com design especial, o livro traz os dois contos já publicados (“Canção da rainha” e “Cicatrizes de aço”), além de quatro histórias inéditas que darão aos leitores mais um vislumbre de seus personagens favoritos e a chance de conhecer caras novas. O volume ainda conta com mapas exclusivos, bandeiras, registros sobre a história de Norta e muito mais!",
                "https://images-na.ssl-images-amazon.com/images/I/81nwkac3N2L.jpg",
                categoryRepository.getById(3)));

        bookRepository.save(new Book(
                "As Crônicas de Nárnia. Brochura",
                26.70,
                "Viagens ao fim do mundo, criaturas fantásticas e batalhas épicas entre o bem e o mal - o que mais um leitor poderia querer de um livro? O livro que tem tudo isso é 'O leão, a feiticeira e o guarda-roupa', escrito em 1949 por Clive Staples Lewis. MasLewis não parou por aí. Seis outros livros vieram depois e, juntos, ficaram conhecidos como 'As crônicas de Nárnia'. Nos últimos cinqüenta anos, 'As crônicas de Nárnia' transcenderam o gênero da fantasia para se tornar parte do cânone da literaturaclássica. Cada um dos sete livros é uma obra-prima, atraindo o leitor para um mundo em que a magia encontra a realidade, e o resultado é um mundo ficcional que tem fascinado gerações. Esta edição apresenta todas as sete crônicas integralmente, num único volume. Os livros são apresentados de acordo com a ordem de preferência de Lewis, cada capítulo com uma ilustração do artista original, Pauline Baynes. Enganosamente simples e direta, 'As crônicas de Nárnia' continuam cativando os leitores com aventuras, personagens e fatos que falam a pessoas de todas as idades.",
                "https://images-na.ssl-images-amazon.com/images/I/71yJLhQekBL.jpg",
                categoryRepository.getById(3)));

        bookRepository.save(new Book(
                "As crônicas de Nárnia - O sobrinho do mago: 1",
                28.49,
                "A aventura começa quando Digory e Polly vão parar no gabinete secreto do excêntrico tio André. Ludibriada por ele, Polly toca o anel mágico e desaparece. Digory, aterrorizado, decide partir imediatamente em busca da amiga no Outro Mundo. Lá ele encontra Polly e, juntos, ouvem Aslam cantar sua canção ao criar o mundo encantado de Nárnia, repleto de sol, árvores, flores, relva e animais. ",
                "https://images-na.ssl-images-amazon.com/images/I/711WTt57f7L.jpg",
                categoryRepository.getById(3)));

        bookRepository.save(new Book(
                "O Ladrão de Raios - Volume 1. Série Percy Jackson e os Olimpianos",
                32.03,
                "Os cinco livros da série que se tornou fenômeno mundial, em edição limitada e com design exclusivo: as cinco lombadas dos livros compõem, juntas, uma ilustração especial de John Rocco.\n" +
                        "Em O ladrão de raios, Percy Jackson, o menino que aos doze anos descobre que é um semideus, filho de Poseidon, precisa impedir uma guerra entre os deuses que destruiria a civilização ocidental; em O Mar de Monstros, ele e os amigos se envolvem em uma perigosa aventura para defender o acampamento dos semideuses; em A maldição do titã, Percy descobre que o Senhor dos Titãs despertou e está disposto a destruir a humanidade; em A batalha do Labirinto, o semideus vai combater o perigoso titã no temido Labirinto de Dédalo; e em O último olimpiano, Percy tem que lidar não só com o exército de Cronos, mas também com a chegada de seu décimo sexto aniversário — e, assim, com a profecia que determinará seu destino.",
                "https://images-na.ssl-images-amazon.com/images/I/91D8ZsToatL.jpg",
                categoryRepository.getById(3)));

        // - Medicina (04)
        bookRepository.save(new Book(
                "Medicina Dos Horrores: A História De Joseph Lister, O Homem Que Revolucionou O Apavorante Mundo Das Cirurgias Do Século XIX",
                31.87,
                "Em Medicina dos horrores, a historiadora Lindsey Fitzharris narra como era o chocante mundo da cirurgia do século XIX, que estava às vésperas de uma profunda transformação. A autora evoca os primeiros anfiteatros de operações — lugares abafados onde os procedimentos eram feitos diante de plateias lotadas — e cirurgiões pioneiros, cujo ofício era saudado não pela precisão, mas pela velocidade e pela força bruta, uma vez que não havia anestesia. Não à toa, os mais célebres cirurgiões da época eram capazes de amputar uma perna em menos de trinta segundos. Trabalhando sem luvas e sem qualquer cuidado com a higiene básica, esses profissionais, alheios à existência de micro-organismos, ficavam perplexos com as infecções pós-operatórias, o que mantinha as taxas de mortalidade implacavelmente elevadas. É nesse cenário, em que se considerava mais provável um homem sobreviver à guerra do que ao hospital, que emerge a figura de Joseph Lister, um jovem médico que desvendaria esse enigma mortal e mudaria o curso da história. Concentrando-se no tumultuado período entre 1850 e 1875, a autora nos apresenta Lister e seus contemporâneos e nos conduz por imundas escolas de medicina, os sórdidos hospitais onde eles aprimoravam sua arte, as “casas da morte” onde estudavam anatomia e os cemitérios, que eles volta e meia invadiam para roubar cadáveres. Chocante e revelador,Medicina dos horrores celebra o triunfo de um visionário, cuja busca para atribuir um caráter científico à medicina terminou por salvar milhões de vidas.",
                "https://images-na.ssl-images-amazon.com/images/I/61rNuLzZ54L.jpg",
                categoryRepository.getById(4)));

        bookRepository.save(new Book(
                "Medicina de Emergência: Abordagem Prática",
                218.53,
                "Totalmente atualizado de acordo com a mais nova literatura científica. Capítulo abordando a grande pandemia de COVID-19 causada pelo coronavírus SARS-COV-2. Explicações claras e didáticas sobre a fisiopatologia das doenças. Algoritmos de decisão clínica. Procedimentos descritos detalhadamente. Discussão da conduta levando em conta riscos e benefícios.",
                "https://images-na.ssl-images-amazon.com/images/I/71l93e2RGaL.jpg",
                categoryRepository.getById(4)));

        bookRepository.save(new Book(
                "Medicina do amanhã: Como a genética, o estilo de vida e a tecnologia juntos podem auxiliar na sua qualidade de vida.",
                24.90,
                "“A divulgação do conhecimento é fundamental para construirmos um novo modelo de criação da saúde.” - Pedro Schestatsky. A SAÚDE DO FUTURO COMEÇA MUDANDO HÁBITOS DE HOJE. Em um mundo mutante é necessário se reinventar todos os dias. Essa verdade vale para a nossa vida profissional e pessoal, mas e quando falamos sobre a nossa saúde? Estamos nos adaptando ou apenas vivendo as regras da Medicina tradicional ditadas há séculos por uma realidade distante da situação atual e na qual as mudanças aconteciam lentamente? Somos reféns de remédios que geram efeitos colaterais que exigem outros remédios e nos prendem nesse ciclo vicioso? Terceirizamos nossa saúde nas mãos de médicos e planos de saúde? Todas essas perguntas nos levam a uma resposta inquestionável: no momento atual, nossa relação com a saúde e com os medicamentos deveria ser diferente. A Medicina do amanhã é, portanto, o caminho para o autoconhecimento integral e para colocar na prática todas as informações e tecnologias disponíveis para melhorar nossa qualidade de vida e longevidade. Com o conhecimento adquirido em mais de vinte anos de experiência como médico e professor, Pedro Schestatsky mostrará como é possível assumir o protagonismo da sua saúde em direção a uma vida mais saudável e longeva. Aqui você vai: Aprender como utilizar a tecnologia a seu favor quando o assunto é saúde; Entender como uma relação diferente com seus médicos o ajudará a conquistar maior autonomia sobre sua vida; Descobrir que a criação da saúde é tão ou mais importante do que o tratamento da doença, e que a ausência de doenças é um “efeito colateral” desse novo foco; Aplicar os 5Ps (predição, prevenção, personalização, proatividade e parceria) no seu dia a dia e mudar a sua relação com a Medicina; Resignificar o conceito “Medicina” e entender que ele não precisa ser sinônimo de algo reativo, que serve apenas àqueles que enfrentam problemas de saúde.",
                "https://images-na.ssl-images-amazon.com/images/I/81IS7glu60L.jpg",
                categoryRepository.getById(4)));

        bookRepository.save(new Book(
                "Anatomia",
                16.79,
                "Resumo completo de Anatomia com mais de 1.400 identificações anatômicas. Os ossos do esqueleto. A coluna vertebral, a estrutura de vértebras e nervos. Os ossos da cabeça. O sistema linfático. O sistema nervoso. O sistema respiratório. O sistema endócrino. O sistema digestório. O sistema urinário. Os sistemas de reprodução masculino e feminino. O sistema circulatório e o coração. O sistema muscular. O cérebro. O quadril. O nervo ciático. Os ligamentos do joelho. A cabeça. A pele. Anatomia da mão, dos dedos e do pé.",
                "https://images-na.ssl-images-amazon.com/images/I/A1vPTuUDvGL.jpg",
                categoryRepository.getById(4)));

        bookRepository.save(new Book(
                "Atlas ilustrado do corpo humano",
                2.00,
                "Neste livro, você vai aprender o mecanismo do corpo humano e da estrutura do esqueleto aos milhões de células que mantêm o corpo vivo.",
                "https://images-na.ssl-images-amazon.com/images/I/51bFBB4GijL.jpg",
                categoryRepository.getById(4)));

        // - Literatura Brasileira (05)
        bookRepository.save(new Book(
                "Dom Casmurro",
                12.99,
                "Em Dom Casmurro, o narrador Bento Santiago retoma a infância que passou na Rua de Matacavalos e conta a história do amor e das desventuras que viveu com Capitu, uma das personagens mais enigmáticas e intrigantes da literatura brasileira. Nas páginas deste romance, encontra-se a versão de um homem perturbado pelo ciúme, que revela aos poucos sua psicologia complexa e enreda o leitor em sua narrativa ambígua acerca do acontecimento ou não do adultério da mulher com olhos de ressaca, uma das maiores polêmicas da literatura brasileira.",
                "https://images-na.ssl-images-amazon.com/images/I/613Ywe4F3vL.jpg",
                categoryRepository.getById(5)));

        bookRepository.save(new Book(
                "História da Literatura Brasileira Vol. I: Das Origens ao Romantismo: Volume 1",
                55.08,
                "Com o texto inteiramente revisto, essa edição do clássico História da Literatura Brasileira, com um novo projeto gráfico e texto completo em três volumes, nos traz em seus capítulos as origens, o Barroco, o Arcadismo e o Romantismo.",
                "https://images-na.ssl-images-amazon.com/images/I/518hT+FvcnL.jpg",
                categoryRepository.getById(5)));

        bookRepository.save(new Book(
                "História Concisa da Literatura Brasileira",
                40.85,
                "Totalmente revista e atualizada pelo autor – professor titular de Literatura Brasileira na USP -, essa obra consagrada aos estudantes universitários, professores e pós-graduados, é tida como a melhor do gênero. Está divida em oito partes: Condição Colonial, Barroco, Arcádia e Ilustração, Romantismo, Realismo, Pré-Modernismo, Modernismo e Tendências Contemporâneas e História da Literatura Brasileira.",
                "https://images-na.ssl-images-amazon.com/images/I/61q5nLBmqXL.jpg",
                categoryRepository.getById(5)));

        bookRepository.save(new Book(
                "O Imbecil Coletivo: Atualidades Inculturais Brasileiras",
                59.85,
                "Quem é o imbecil coletivo?Ele é duplo: nasce do improvável matrimônio do intelectual pernóstico com a ralé enfurecida. Ele é um fanático hidrófobo com um toque elegante de ceticismo relativista. É o corpo de Bakunin com a cabeça de Anatole France. Entre a verdade e a falsidade, ele tem a imparcialidade da indiferença. Mas, como um verdadeiro sábio chinês que age não agindo, ele faz de sua omissão o motor da história, cedendo o passo à iniciativa das massas e deixando que o milagre da praxis transmute as contradições teoréticas em violência física, que é, no fim das contas, a única resposta decisiva aos olhos do cético.Vinte e cinco anos depois do seu lançamento, eis a décima edição d’O imbecil coletivo, pedra de escândalo da intelligentzia brasileira de ontem, de hoje e de sempre. A edição resgata o texto integral do livro, sem os cortes que ele sofrera em suas últimas edições, e o apresenta com novo prefácio do crítico literário Rodrigo Gurgel.",
                "https://images-na.ssl-images-amazon.com/images/I/71K1XCxTKLL.jpg",
                categoryRepository.getById(5)));

        bookRepository.save(new Book(
                "Tarde",
                10.90,
                "Os poemas de Tarde, publicados postumamente em 1919, estão reunidos sob um título que deixa transparecer o tom crepuscular predominante nas composições. O livro revela um sujeito às voltas com a antevelhice, nostálgico e mais reflexivo do que em sua produção anterior. Fruto da maturidade do autor, tornou-se o livro de sonetos mais conhecido do autor.",
                "https://images-na.ssl-images-amazon.com/images/I/71ZQyInMj0L.jpg",
                categoryRepository.getById(5)));

        // - Romance (06)
        bookRepository.save(new Book(
                "O acordo",
                29.90,
                "Hannah Wells finalmente encontrou alguém que a interessasse. Embora seja autoconfiante em vários outros aspectos da vida, carrega nas costas uma bagagem e tanto quando o assunto é sexo e sedução. Não vai ter jeito: ela vai ter que sair da zona de conforto… Mesmo que isso signifique dar aulas particulares para o infantil, irritante e convencido capitão do time de hóquei, em troca de um encontro de mentirinha. Tudo o que Garrett Graham quer é se formar para poder jogar hóquei profissional. Mas suas notas cada vez mais baixas estão ameaçando arruinar tudo aquilo pelo que tanto se dedicou. Se ajudar uma garota linda e sarcástica a fazer ciúmes em outro cara puder garantir sua vaga no time, ele topa. Mas o que era apenas uma troca de favores entre dois opostos acaba se tornando uma amizade inesperada. Até que um beijo faz que Hannah e Garret precisem repensar os termos de seu acordo.",
                "https://images-na.ssl-images-amazon.com/images/I/91oyypSxfeS.jpg",
                categoryRepository.getById(6)));

        bookRepository.save(new Book(
                "Mais que amigos",
                19.47,
                "Será que vale a pena arriscar uma grande amizade em troca de um amor inesquecível? Aos vinte e dois anos, a jovem Parker Blanton leva a vida que sempre sonhou. Tem um namorado inteligente e responsável, um emprego promissor e a companhia de seu melhor amigo, Ben Olsen, com quem divide um lindo apartamento. Parker e Ben são tão grudados que muita gente duvida que eles morem sob o mesmo teto sem nunca ter vivido um caso, mas eles não se importam com o que as pessoas pensam. Sabem que não foram feitos um para o outro ― pelo menos não para se envolver. Por isso, quando um acontecimento inesperado faz com que Parker se veja sem namorado e com o coração partido, ela sabe que pode contar com Ben para ajudá-la a sacudir a poeira e partir para outra. Afinal, ninguém seria mais ideal do que seu melhor amigo para lhe mostrar os prazeres da vida de solteiro… certo? Mais que amigos é uma comédia romântica irresistível! CONTEÚDO ADULTO ",
                "https://images-na.ssl-images-amazon.com/images/I/91lxxIREpeL.jpg",
                categoryRepository.getById(6)));

        bookRepository.save(new Book(
                "Antes que Você Diga Sim",
                50.34,
                "Abby Porter tem o emprego dos sonhos e o noivo perfeito. Mas quando se vê sobrecarregada com os preparativos do casamento, seu noivo contrata Jordan Cohen, uma dama de honra profissional para ajudá-la. E é aí que seu mundo vira de pernas para o ar. A relação entre ela e Jordan começa a mudar... o que deveria ser amizade, se torna algo mais. Agora, Abby vai ter que decidir se está realmente pronta para dizer sim. Com personagens cativantes e carismáticos, e uma história doce e divertida sobre amor e escolhas, a autora bestseller Clare Lydon conquistou leitores no mundo todo.",
                "https://images-na.ssl-images-amazon.com/images/I/719rDQPFGRL.jpg",
                categoryRepository.getById(6)));

        bookRepository.save(new Book(
                "Mais Escuro. Cinquenta Tons Mais Escuros Pelos Olhos de Christian - Volume 2",
                19.90,
                "E L James revisita Cinquenta tons com um mergulho mais profundo e sombrio na história de amor que envolveu milhões de leitores em todo o mundo. O relacionamento quente e sensual de Anastasia Steele e Christian Grey chega ao fim com muitas acusações e sofrimento, mas Grey não consegue tirar Ana da cabeça. Determinado a reconquistá-la, ele tenta suprimir seus desejos mais obscuros e sua necessidade de controle absoluto, e disposto a amar Ana nos termos estabelecidos por ela. Mas os horrores de sua infância ainda o assombram, e, como se não bastasse, o chefe manipulador de Ana, Jack Hyde, claramente a quer. Será que o terapeuta e confidente de Grey, Dr. Flynn, poderá ajudá-lo a enfrentar seus demônios? Ou será que a possessividade de Elena, sua sedutora, e a devoção perturbada de Leila, sua ex-submissa, vão arrastá-lo para o passado? E se Christian vai reconquistar Ana, será que um homem tão sombrio e cheio de problemas espera mesmo mantê-la?",
                "https://images-na.ssl-images-amazon.com/images/I/61Qc9fUlZiL.jpg",
                categoryRepository.getById(6)));

        bookRepository.save(new Book(
                "Box da Trilogia Cinquenta Tons de Cinza",
                29.90,
                "Fenômeno editorial sem precedentes, a Trilogia Cinquenta tons de cinza conquistou uma legião de fãs ao redor do planeta, ultrapassando a marca inédita de 40 milhões de exemplares vendidos em todo o mundo. No Brasil, mais de 900 mil livros foram comercializados em 80 dias, uma média de 468 exemplares por hora. Agora, os três volumes da série que marca a estreia literária da inglesa E L James estão reunidos em um box especial, com edição limitada e design exclusivo: Cinquenta tons de cinza, que narra o início da ardente história de amor entre a recatada estudante Anastasia Steele e o enigmático empresário Christian Grey; Cinquenta tons de liberdade, em que Ana e Christian lutam para superar as diferenças e os problemas do passado e enfim ficar juntos; e Cinquenta tons de liberdade, que traz o tão aguardado desfecho da Trilogia que dominou o mundo.",
                "https://images-na.ssl-images-amazon.com/images/I/71yt44c2h-L.jpg",
                categoryRepository.getById(6)));

        bookRepository.save(new Book(
                "Cinquenta Tons Mais Escuros: (Série Cinquenta tons de cinza vol. 2)",
                3.40,
                "Assustada com os segredos obscuros do belo e atormentado Christian Grey, Ana Steele põe um ponto final em seu relacionamento com o jovem empresário e concentra-se em sua nova carreira, numa editora de livros. Mas o desejo por Grey domina cada pensamento de Ana e, quando ele propõe um novo acordo, ela não consegue resistir. Em pouco tempo, Ana descobre mais sobre o angustiante passado de seu amargurado e dominador parceiro do que jamais imaginou ser possível. Enquanto Christian tenta se livrar de seus demônios interiores, Ana se vê diante da decisão mais importante da sua vida.",
                "https://images-na.ssl-images-amazon.com/images/I/711oa-je6ZL.jpg",
                categoryRepository.getById(6)));

        // - Infantil (07)
        bookRepository.save(new Book(
                "100 páginas para colorir – Disney – Meninas",
                10.09,
                "Literatura infantil de qualidade; um livro produzido e idealizado especialmente para estimular o prazer da leitura; edição atualizada em formato brochura.",
                "https://images-na.ssl-images-amazon.com/images/I/91P7CxHq3cL.jpg",
                categoryRepository.getById(7)));

        bookRepository.save(new Book(
                "O pequeno príncipe",
                10.74,
                "Nesta clássica história que marcou gerações de leitores em todo o mundo, um piloto cai com seu avião no deserto do Saara e encontra um pequeno príncipe, que o leva a uma jornada filosófica e poética através de planetas que encerram a solidão humana. A edição conta com a clássica tradução do poeta imortal dom Marcos Barbosa, e é a versão mais consagrada da obra, publicada no Brasil desde 1952.",
                "https://images-na.ssl-images-amazon.com/images/I/81MscdgdwLL.jpg",
                categoryRepository.getById(7)));

        bookRepository.save(new Book(
                "O Menino Maluquinho",
                22.90,
                "Um menininho traquinas, diziam. Tinha macaquinhos no sótão, deitava e rolava, fazendo confusão. Um anjinho, um saci? Alegria da casa, liderava a garotada. Namorador, fazia versinhos, compunha canções, inventava brincadeiras. Era sabido, um amigão. “Menino Maluquinho”, diziam sorrindo as pessoas. Não era, não! Só mais tarde descobriram que tinha sido um garotinho muito amado e, por isso mesmo, muito feliz.",
                "https://images-na.ssl-images-amazon.com/images/I/911o1h5gIzL.jpg",
                categoryRepository.getById(7)));

        bookRepository.save(new Book(
                "O Show da Luna - Atlas - Viajando pelo mundo",
                4.00,
                "Neste livro, nós iremos juntos explorar alguns lugares do mundo. Embarque nessa aventura junto conosco e divirta-se. Essa será a melhor experiência de todas!",
                "https://images-na.ssl-images-amazon.com/images/I/618OqgfvtyL.jpg",
                categoryRepository.getById(7)));

        bookRepository.save(new Book(
                "Disney. Meninos - Coleção 100 Páginas Para Colorir ",
                9.49,
                "Literatura infantil de qualidade; um livro produzido e idealizado especialmente para estimular o prazer da leitura; edição atualizada em formato brochura.",
                "https://images-na.ssl-images-amazon.com/images/I/91rZNdZ8IFL.jpg",
                categoryRepository.getById(7)));

        // - Poesia (08)
        bookRepository.save(new Book(
                "Meu corpo virou poesia",
                27.87,
                "Em 2017, Bruna Vieira fez as malas, deixou a vida no Brasil de lado e foi escrever uma nova história em outro país, vestida de coragem e guiada por um sentimento que sempre foi sua maior prioridade: o amor. Com o tempo, porém, os dias foram ficando cada vez mais longos e solitários. Era como se naquele lugar o amor tivesse perdido o equilíbrio e se tornado uma obrigação. Foi bem perto do fim e de jeito mais frio que ela finalmente se deu conta: é impossível ser “nós” sozinha. Formado por quatro partes ― cabeça, garganta, pulmão e ventre ―, este livro é um mapa. Um mapa que leva Bruna de volta à escrita e a si mesma. São relatos reais, repletos de lembranças, aprendizados e cicatrizes, que agora deixam o corpo da autora para encontrar o seu, em forma de poesia. Ao tocar em temas como autoestima, amizade feminina e relacionamentos (com o outro e sobretudo consigo mesma), Bruna olha para dentro e nos convida a percorrer nestes versos nossa própria viagem de autodescoberta.",
                "https://images-na.ssl-images-amazon.com/images/I/91l6cuDfKvS.jpg",
                categoryRepository.getById(8)));

        bookRepository.save(new Book(
                "Poesia completa",
                79.91,
                "Um dos maiores poetas de língua portuguesa do século XX, João Cabral de Melo Neto ficou conhecido pelo estilo conciso, rigor formal e apurada crítica social ― numa comparação feita por ele mesmo, o poeta seria como um escultor, que incessantemente corta a pedra até que a escultura surja de dentro dela. Sua produção foi reunida nesta Poesia completa, que traz seus primeiros poemas e depois seu primeiro livro, Pedra do sono, lançado no início dos anos 1940, passando por textos que já se tornaram clássicos da nossa literatura como O cão sem plumas, Morte e vida Severina, A educação pela pedra, Museu de tudo, Auto do frade, até Sevilha andando, seu derradeiro livro. O autor faleceu em 1999, deixando uma obra de força descomunal. Para comemorar seu centenário, esta Poesia completa traz ainda textos póstumos, dispersos e inéditos, organizados por Antonio Carlos Secchin com a colaboração de Edneia Ribeiro.",
                "https://images-na.ssl-images-amazon.com/images/I/A1tt20nqlRL.jpg",
                categoryRepository.getById(8)));

        bookRepository.save(new Book(
                "Todas as coisas que eu te escreveria se pudesse - Textos Cruéis Demais",
                29.87,
                "O autor nacional de ficção mais lido em 2020, Igor Pires lança o quarto livro da série Textos cruéis demais para serem lidos rapidamente. Em Todas as coisas que eu te escreveria se pudesse, Igor fala sobre amor, amar e deixar ir, ser intenso e abraçar a sua intensidade. Sobre dizer e sentir tudo sem gaguejar. Sobre enfrentar a dor e aceitar que a cura é um processo contínuo, imprevisível, não linear. Escrita durante a pandemia, a obra é uma coleção de textos poéticos sobre todas as impressões que ficam quando alguém vai embora – ainda que esse alguém seja você mesmo. Além de toda a poesia e sensibilidade características do autor, o livro traz as coloridas ilustrações – que flertam com o surreal – de Jônatas Moreira.",
                "https://images-na.ssl-images-amazon.com/images/I/71UY2qbj+fL.jpg",
                categoryRepository.getById(8)));

        bookRepository.save(new Book(
                "Poesias: 119",
                20.00,
                "A perfeição formal, o culto à beleza e o preciosismo concederam a Olavo Bilac o título de “príncipe dos poetas”. Poucos escritores manifestaram tal propriedade ao pintar retratos com as palavras. Em cada verso e cada rima, a poesia revela a imponderável beleza das coisas – da arte, do amor, da natureza, da mulher. Sua poesia transcende as limitações formais e o frio objetivismo do Parnasianismo, conforme flerta com a estética romântica e sua sensualidade, brinca com a sonoridade das palavras e dialoga com o passado histórico do Brasil. A presente edição reúne os livros Panóplias, Via Láctea, Sarças de fogo, Alma inquieta, As viagens, O caçador de esmeraldas e Tarde. Traz ainda a seleção de algumas das principais crônicas de Bilac, que revelam um lado pouco conhecido de um dos poetas mais importantes e controversos de nossa literatura.",
                "https://images-na.ssl-images-amazon.com/images/I/A1qIxAi4XZS.jpg",
                categoryRepository.getById(8)));

        bookRepository.save(new Book(
                "Poesias: 2",
                11.78,
                "Esta antologia organizada por Sueli Barros Cassal contém poemas escritos pelo poeta português Fernando Pessoa em suas diversas fases e também por seus heterônimos.",
                "https://images-na.ssl-images-amazon.com/images/I/61nonJamxkL.jpg",
                categoryRepository.getById(8)));

        // - Suspense (09)
        bookRepository.save(new Book(
                "O inocente: Livro que está na Netflix",
                23.87,
                "Aos 20 anos, Matt Hunter vive uma noite de horror que ficará para sempre gravada em sua memória. Durante uma festa, ao tentar apartar uma briga, ele mata uma pessoa acidentalmente e é considerado culpado pelo júri. Agora, nove anos depois de ser libertado da prisão, tudo parece ter entrado nos eixos: Olivia, sua esposa, está grávida e os dois estão prestes a comprar uma casa na cidade natal dele. Mas a ilusão acaba quando Matt recebe um vídeo chocante e inexplicável que começa a despedaçar sua vida pela segunda vez. Para piorar, ele passa a ser seguido por um homem misterioso. Em pouco tempo, o perseguidor é encontrado morto e uma freira querida por todos também é assassinada. Quando todas as pistas apontam para Matt, ele e Olivia são forçados a desabar a lei numa tentativa desesperada de salvar seu futuro juntos.",
                "https://images-na.ssl-images-amazon.com/images/I/61O-+YewyOL.jpg",
                categoryRepository.getById(9)));

        bookRepository.save(new Book(
                "A paciente silenciosa",
                26.53,
                "Só ela sabe o que aconteceu.Só ele pode fazê-la falar. A paciente silenciosa é um daqueles livros que não saem da cabeça do leitor, quer ele queira, quer não. Alicia Berenson tinha uma vida perfeita. Ela era uma pintora famosa casada com um fotógrafo bem-sucedido e morava numa área nobre de Londres que dá para o parque de Hampstead Heath. Certa noite, Gabriel, seu marido, voltou tarde para casa depois de um ensaio para a Vogue, e de repente a vida de Alicia mudou completamente...Alicia tinha 33 anos quando deu cinco tiros no rosto do marido, e ela nunca mais disse uma palavra.A recusa de Alicia a falar ou a dar qualquer explicação transforma essa tragédia doméstica em algo muito maior - um mistério que atrai a atenção do público e aumenta ainda mais a fama da pintora. Entretanto, enquanto seus quadros passam a ser mais valorizados que nunca, ela é levada para o Grove, um hospital psiquiátrico judiciário na zona norte de Londres.Enquanto isso, Theo Faber é um psicoterapeuta forense que espera há muito tempo por uma oportunidade de trabalhar com Alicia. Ele tem certeza de que é a pessoa certa para lidar com o caso. No entanto, sua determinação para fazê-la falar e desvendar o mistério de por que ela atirou no marido o arrasta para um caminho tortuoso que sugere que as raízes do silêncio de Alicia são muito mais profundas do que ele jamais poderia imaginar.Porém, se ela falar, ele será capaz de ouvir a verdade?A paciente silenciosa é thrillers psicológico impactante, com um mistério envolvente com um final eletrizante que faz o leitor questionar tudo que acabou de ler.Best-seller do The New York Times. “Uma mistura de suspense hitchcockiano, trama de Agatha Christie e tragédia grega” - Entertainment Weekly“Um thriller psicológico provocativo e com uma trama intrincada que coloca Alex Michaelides entre os grandes autores do gênero.” - Publishers Weekly",
                "https://images-na.ssl-images-amazon.com/images/I/91R8S52UP6L.jpg",
                categoryRepository.getById(9)));

        bookRepository.save(new Book(
                "Deixada Para Trás",
                24.90,
                "Duas colegas são raptadas. Megan foge e, um ano depois, escreve um livro que se torna um sucesso. Um detalhe inconveniente: Nicole continua desaparecida. Nicole e Megan são alunas do último ano da high school de Emerson Bay, uma cidadezinha na Carolina do Norte. Certa noite de verão, elas desaparecem de uma festa à beira do lago. A polícia realiza uma busca intensa, mas não encontra nenhuma pista. Quando já haviam perdido as esperanças de encontrá-las com vida, Megan aparece, milagrosamente, ao conseguir escapar do cativeiro escondido nas profundezas da mata. Um ano depois, Megan lança um livro contando o seu martírio naquelas duas semanas, e, imediatamente, ele se torna um best-seller e a converte de uma heroína local em celebridade nacional. Trata-se de um relato triunfante e inspirador, exceto por um detalhe inconveniente: Nicole continua desaparecida. Livia, irmã mais velha de Nicole, aluna de patologia forense, espera que um dia, em breve, o corpo de Nicole seja encontrado, e caberá a alguém como ela analisar a evidência e determinar finalmente a causa da morte de sua irmã. Em vez disso, a primeira pista do desaparecimento de Nicole surge de outro corpo que chega ao necrotério onde ela trabalha. É de alguém ligado ao passado de Nicole. Então, Livia entra em contato com Megan para contar a descoberta, e pedir mais detalhes da noite em que as duas foram sequestradas. Como outras garotas também desapareceram, Livia começa a acreditar que existe uma forte ligação entre todos aqueles casos. No entanto, Megan sabe mais do que revelou em seu livro. Lampejos de memória surgem, apontando para algo mais sombrio e monstruoso do que o descrito em suas arrepiantes memórias. Quanto mais ela e Livia se aprofundam, mais se dão conta de que, às vezes, o terror verdadeiro está em encontrar exatamente o que estávamos procurando.",
                "https://images-na.ssl-images-amazon.com/images/I/81wNyetQRTL.jpg",
                categoryRepository.getById(9)));

        bookRepository.save(new Book(
                "A corrente",
                22.20,
                "Vítima. Sobrevivente. Sequestrador. Criminoso. Você vai se tornar cada um deles.O dia começa como qualquer outro. Rachel Klein deixa no ponto de ônibus a filha de 13 anos, Kylie, e segue sua rotina. Mas o telefonema de um número desconhecido muda tudo. Do outro lado, uma voz de mulher avisa que Kylie está no banco de trás de seu carro, e que Rachel só verá a filha de novo se pagar um resgate - e sequestrar outra criança.Assim como Rachel, a mulher no telefone é mãe, também teve o filho sequestrado e, se Rachel não fizer exatamente o que ela manda, o menino morre, e Kylie também. Agora Rachel faz parte da Corrente, um esquema aterrorizante que transforma os pais das vítimas em criminosos - e, ao mesmo tempo, deixa alguém muito rico. A Corrente é implacável, apavorante e totalmente anônima. As regras são simples: entregar o valor exigido, escolher outra vítima e cometer um ato abominável do qual, apenas vinte e quatro horas antes, você se julgaria incapaz.Rachel é uma mulher comum, mas, nos dias que se seguem, será levada a extremos que ultrapassam todos os limites do aceitável. Ela será obrigada a fazer escolhas morais inconcebíveis e executar ordens terríveis. Os cérebros por trás da Corrente sabem que os pais farão qualquer coisa pelos filhos. Mas o que eles não sabem é que talvez tenham se deparado com uma oponente à altura. Rachel é inteligente, determinada e... uma sobrevivente. 'Esta história é incrivelmente original. Você não vai parar de pensar nela por muito tempo.' - Stephen King 'A corrente é diabólico, inquietante e dá novo significado à palavra 'implacável'. Adrian McKinty entrou para minha lista de autores de suspense obrigatórios. Escreve com confiança, emoção e muito estilo. Ele é o cara.' - Dennis Lehane",
                "https://images-na.ssl-images-amazon.com/images/I/71Ae2-3zX9L.jpg",
                categoryRepository.getById(9)));

        bookRepository.save(new Book(
                "Stalker: Quando a inveja se torna uma obsessão",
                19.50,
                "Ela não quer ser igual a você. Ela quer a sua vida. Quando Fig Coxbury compra uma casa na West Barrett Street, sua maior motivação não é o amor pelo bairro, ou ter se apaixonado pelo imóvel. É para ficar mais próxima de tudo o que ela deseja: o marido, a criança e a vida que pertence a outra pessoa. Com os olhos fixos na família Avery, Fig se insere gradualmente na rotina de Jolene, Darius e sua filha, Mercy. E não para por aí... Fig invade a privacidade familiar, e logo acredita que pode assumir, definitivamente, o lugar de Jolene. Ela persegue. Copia. Manipula. Cobiça. Usa táticas e cenas a cada momento. Toda stalker tem um objetivo. Para Fig, nada deve ficar em seu caminho.",
                "https://images-na.ssl-images-amazon.com/images/I/61cSdiJhIhL.jpg",
                categoryRepository.getById(9)));

        // - Fantasia (10)
        bookRepository.save(new Book(
                "O Labirinto Do Fauno",
                32.69,
                "Quando estreou nos cinemas, O Labirinto do Fauno encantou público e crítica com sua história que mesclava sonho e realidade, trazendo para o universo da fantasia o cruel cotidiano da Espanha fascista de Franco. Mais de dez anos depois, a produção permanece conquistando fãs e mostrando que boas histórias são atemporais. Nesta edição mais do que especial, o escritor, diretor e roteirista mexicano Guillermo del Toro — a mente por trás do filme e um dos artistas mais inventivos dos últimos tempos — se une a Cornelia Funke, premiada escritora de contos de fadas modernos e autora da trilogia Mundo de Tinta, para narrar a jornada de uma menina pelo Reino dos Homens e pelo Reino Subterrâneo. Nesta edição mais do que especial, o escritor, diretor e roteirista mexicano Guillermo del Toro — a mente por trás do filme e um dos artistas mais inventivos dos últimos tempos — se une a Cornelia Funke, premiada escritora de contos de fadas modernos e autora da trilogia Mundo de Tinta, para narrar a jornada de uma menina pelo Reino dos Homens e pelo Reino Subterrâneo. Mas o que eles não sabem é que a floresta que tanto odeiam também abriga criaturas mágicas e poderosas, habitantes de um reino subterrâneo repleto de encantos e horrores, súditos em busca de sua princesa há muito perdida. Uma princesa que, segundo os sussurros das árvores, finalmente retornou ao lar. ",
                "https://images-na.ssl-images-amazon.com/images/I/71nygThi5FL.jpg",
                categoryRepository.getById(10)));

        bookRepository.save(new Book(
                "A traição de Camelot (As novas lendas de Camelot, v.2)",
                40.71,
                "Em Camelot, tudo parece em ordem: o Rei Arthur está formando alianças e expandindo a influência do reino, com a Rainha Guinevere ao seu lado. Todas as noites, no entanto, sonhos sombrios e um poder desconhecido atormentam a jovem. Guinevere pode ter aceitado seu novo papel, porém ainda sente que não encontrou seu lugar. Conforme ela se aproxima das pessoas ao redor, vai se percebendo vazia – Brangien e seu amor por Isolda; Lancelote, que luta para provar valor como cavaleiro; e há também Arthur, que é tudo para seu povo e, portanto, nunca o suficiente para Guinevere. A jovem não tem memórias da infância, e nenhuma ideia de quem era antes de se tornar Guinevere. E quanto mais tenta se reconhecer como rainha, mais acredita que Mordred pode estar certo: ela não pertence àquele lugar. Nunca vai pertencer. Quando um resgate falha e resulta na morte de algo precioso, uma Guinevere devastada retorna a Camelot, onde encontrará a maior ameaça de todas. Não se trata da Rainha das Trevas ou de um exército invasor, mas a irmã mais nova da verdadeira Guinevere. A farsa terá chegado ao fim? E quem, afinal, ela está enganando: Camelot ou a si mesma? Neste segundo volume da série As Novas Lendas de Camelot, Guinevere se aproxima ainda mais de segredos que espreitam nas profundezas da própria mente, levando seu coração por um caminho que pode significar o fim de Camelot",
                "https://images-na.ssl-images-amazon.com/images/I/81TT90QJgQS.jpg",
                categoryRepository.getById(10)));

        bookRepository.save(new Book(
                "Sombra e Ossos",
                27.98,
                "Em um país dividido pela Dobra das Sombras – uma faixa de terra povoada por monstros sombrios – e no qual a corte real está repleta de pessoas com poderes mágicos, Alina Starkov pode se considerar uma garota comum. Seus dias consistem em trabalhar como cartógrafa no Exército e em tentar esconder de seu melhor amigo, Maly, o que sente por ele. Quando Maly é gravemente ferido por um dos monstros que vivem na Dobra, Alina, desesperada, descobre que é muito mais forte do que pensava: ela é consegue invocar o poder da luz, a única coisa capaz de acabar com a Dobra das Sombras e reunificar Ravka de uma vez por todas. Por conta disso, Alina é enviada ao Palácio para ser treinada como parte de um grupo de guerreiros com habilidades extraordinárias, os Grishas. Sob os cuidados do Darkling, o Grisha mais poderoso de todos, Alina terá que aprender a lidar com seus novos poderes, navegar pelas perigosas intrigas da corte e sobreviver a ameaças vindas de todos os lados.",
                "https://images-na.ssl-images-amazon.com/images/I/81WKPIFKThL.jpg",
                categoryRepository.getById(10)));

        bookRepository.save(new Book(
                "A rainha vermelha",
                24.90,
                "O mundo de Mare Barrow é dividido pelo sangue: vermelho ou prateado. Mare e sua família são vermelhos: plebeus, humildes, destinados a servir uma elite prateada cujos poderes sobrenaturais os tornam quase deuses. Mare rouba o que pode para ajudar sua família a sobreviver e não tem esperanças de escapar do vilarejo miserável onde mora. Entretanto, numa reviravolta do destino, ela consegue um emprego no palácio real, onde, em frente ao rei e a toda a nobreza, descobre que tem um poder misterioso… Mas como isso seria possível, se seu sangue é vermelho? Em meio às intrigas dos nobres prateados, as ações da garota vão desencadear uma dança violenta e fatal, que colocará príncipe contra príncipe - e Mare contra seu próprio coração.",
                "https://images-na.ssl-images-amazon.com/images/I/71-gOnTKuOL.jpg",
                categoryRepository.getById(10)));

        bookRepository.save(new Book(
                "O Hobbit + pôster",
                27.86,
                "Bilbo Bolseiro era um dos mais respeitáveis hobbits de todo o Condado até que, um dia, o mago Gandalf bate à sua porta. A partir de então, toda sua vida pacata e campestre soprando anéis de fumaça com seu belo cachimbo começa a mudar. Ele é convocado a participar de uma aventura por ninguém menos do que Thorin Escudo-de-Carvalho, um príncipe do poderoso povo dos Anãos. Esta jornada fará Bilbo, Gandalf e 13 anãos atravessarem a Terra-média, passando por inúmeros perigos, sejam eles, os imensos trols, as Montanhas Nevoentas infestadas de gobelins ou a muito antiga e misteriosa Trevamata, até chegarem (se conseguirem) na Montanha Solitária. Lá está um incalculável tesouro, mas há um porém. Deitado em cima dele está Smaug, o Dourado, um dragão malicioso que... bem, você terá que ler e descobrir. Lançado em 1937, O Hobbit é um divisor de águas na literatura fantástica mundial. Mais de 80 anos após a sua publicação, o livro que antecede os ocorridos em O Senhor dos Anéis continua arrebatando fãs de todas as idades, talvez pelo seu tom brincalhão com uma pitada de magia élfica, ou talvez porque J.R.R. Tolkien tenha escrito o melhor livro infanto-juvenil de todos os tempos.",
                "https://images-na.ssl-images-amazon.com/images/I/91M9xPIf10L.jpg",
                categoryRepository.getById(10)));

        // - Artes (11)
        bookRepository.save(new Book(
                "Van Gogh",
                70.31,
                "Mestre da pintura do século XIX e profeta da arte moderna, Vincent Willem van Gogh (18531890) nasceu num vilarejo fronteiriço nos confins pantanosos do sul da Holanda, filho primogênito de um modesto pastor protestante. Solitário e impetuoso desde criança, o artista fracassou em todas as tentativas de se fixar numa profissão “respeitável”. Somente encontrou alívio parcial para seus anseios excruciantes na produção de milhares de desenhos e pinturas, ao mesmo tempo em que submergia na doença e na loucura. Steven Naifeh e Gregory White Smith apresentam nesta monumental reconstituição biográfica uma visão ao mesmo tempo erudita e apaixonada sobre o artista holandês. Os autores, responsáveis por uma biografia de Jackson Pollock (inédita no Brasil e inspiradora do filme Pollock, de 2000), esmiúçam o conturbado relacionamento com os pais, a amizade com o irmão Theo, a relação intensa com a religião, a errância entre diversas cidades, a vida sexual desregrada, o fracasso em vender suas obras, a amizade conturbada com Paul Gauguin, a loucura, a orelha mutilada - e sugere uma explicação surpreendente para o suposto suicídio. Amparados pela mais ampla documentação já reunida sobre Van Gogh, Naifeh e Smith orientam o leitor com impecável segurança através do intrincado labirinto de referências estéticas, literárias e religiosas que definiu sua curta existência. Desse modo, diversas imprecisões, bem como mitos há muito estabelecidos na fortuna crítica vangoghiana, são esclarecidos com admirável sensibilidade humana e artística. O livro é complementado pelo site www.vangoghbiography.com (em inglês), com notas bibliográficas e vasto material iconográfico. “A biografia definitiva para as próximas décadas.” - Leo Jansen, curador do Museu Van Gogh (Amsterdam) “O que [Naifeh e Smith] capturam poderosamente em Van Gogh é sua extraordinária determinação para aprender, perseverar contra os infortúnios, continuar a pintar mesmo quando seus primeiros professores o ridicularizavam, quando uma facilidade natural parecia enganá-lo, quando suas telas encalhavam.” - Michiko Kakutani, The New York Times “Uma biografia de Van Gogh minuciosa o suficiente para ensejar uma reavaliação de tudo o que já se escreveu sobre o artista, e do que ele escreveu sobre si mesmo.” - William Feaver, The Guardian",
                "https://images-na.ssl-images-amazon.com/images/I/A1iDo4IxphS.jpg",
                categoryRepository.getById(11)));

        bookRepository.save(new Book(
                "Arte moderna",
                155.44,
                "'Giulio Carlo Argan foi o último representante de uma grande tradição crítica que corresponde historicamente aos movimentos modernos da arte. De fato, o crítico e ensaísta italiano provém de uma escola (a de Adolfo e Lionello Venturi) que procura o sentido da arte na sua história, mais do que em faculdades inatas ou em princípios absolutos. Foi Argan, aliás, que levou essa orientação até as últimas conseqüências: se a arte é um fenômeno histórico, não há garantia de que ela seja eterna. O desaparecimento do artesanato, de que a arte era guia e modelo, e o surgimento da produção industrial, que se baseia sobre outros princípios, pode muito bem determinar o fim da arte como atividade culturalmente relevante. Essa tese é o pano de fundo desta Arte moderna.' Lorenzo Mammì",
                "https://images-na.ssl-images-amazon.com/images/I/91aBvPCAdXL.jpg",
                categoryRepository.getById(11)));

        bookRepository.save(new Book(
                "Leonardo - A obra gráfica",
                124.90,
                "Este livro apresenta os desenhos do grande mestre da história da arte, a partir de estudos anatômicos e retratos de crianças rechonchudas com projetos complexos de engenharia e desenhos arquitetônicos. Mais de 600 desenhos de página inteira, compilados a partir de nossa edição original em formato XL.",
                "https://images-na.ssl-images-amazon.com/images/I/81CFxJqd5QL.jpg",
                categoryRepository.getById(11)));

        bookRepository.save(new Book(
                "Van Gogh",
                9.99,
                "Conheça o grande artista Van Gogh e algumas de suas pinturas magníficas neste livro de arte com adesivos. Você vai conhecer os fatos mais marcantes da vida de Van Gogh e ainda se divertir completando as páginas com os adesivos. Conhecer um artista nunca foi tão interessante!",
                "https://images-na.ssl-images-amazon.com/images/I/51CheMCcuAL.jpg",
                categoryRepository.getById(11)));

        bookRepository.save(new Book(
                "A História da Arte (Pocket Edition)",
                63.89,
                "A História da Arte é o mais célebre e popular livro sobre arte já publicado. Por mais de 50 anos, foi uma introdução inigualável ao tema, desde as primeiras pinturas nas cavernas até a arte experimental de hoje. Em todo o mundo, leitores de todas as idades e formações encontraram no Professor Gombrich um verdadeiro mestre, que alia conhecimento e sabedoria a um talento peculiar para comunicar de maneira direta seu profundo amor pelas obras de arte que descreve.A História da Arte deve sua duradoura popularidade não só ao texto objetivo e simples, mas também à perícia do autor em apresentar uma narrativa clara. Ele descreve sua intenção de 'pôr em alguma ordem inteligível a profusão de nomes, períodos e estilos que congestionam as páginas de obras mais ambiciosas', e, fazendo uso de seus conhecimentos da psicologia das artes visuais, leva-nos a ver a história da arte como \"a história do contínuo entrelaçamento e transformação de tradições em que cada obra se refere ao passado e aponta para o futuro\", \"uma rede viva de tradição que ainda liga os nossos dias ao tempo das pirâmides\". Neste novo formato, a edição de bolso (Pocket Edition) desta obra clássica pretende continuar sua trajetória triunfal junto às novas gerações e manter-se como a primeira opção de todos os recém-chegados ao campo da arte.",
                "https://images-na.ssl-images-amazon.com/images/I/51N6PcXGLSL.jpg",
                categoryRepository.getById(11)));

        // - Filosofia (12)
        bookRepository.save(new Book(
                "Filosofia: e nós com isso?",
                18.16,
                "Um dos grandes nomes da filosofia nacional, Mario Sergio Cortella já conquistou milhares de pessoas com suas palestras e livros esclarecedores e provocativos. Nesta nova obra, \"Filosofia: e nós com isso?\", aborda um assunto profundo e necessário, e explica porque a Filosofia é tão importante para nossa vivência. Segundo Cortella: “A principal contribuição da Filosofia é criar obstáculos, de modo a impedir que as pessoas fiquem prisioneiras do óbvio, isto é, que circunscrevam a sua existência dentro de limites estreitos, de horizontes indigentes e de esperanças delirantes. Em outras palavras, a Filosofia estende a nossa consciência e fortalece nossa autonomia.” ",
                "https://images-na.ssl-images-amazon.com/images/I/81RIBWe5VvL.jpg",
                categoryRepository.getById(12)));

        bookRepository.save(new Book(
                "Filosofia para mortais",
                21.96,
                "A mortalidade é condição inescapável para a filosofia. É ela que nos lembra todos os dias o quanto somos imperfeitos e que nos angustia com nossa própria insignificância no mundo. Mas, ao mesmo tempo, é ela que nos motiva a viver plenamente, a tirar o maior proveito de nossa curta estadia neste planeta, a nos tornar melhores a cada dia. Trilhar uma vida com significados não é simples, mas a filosofia está aí para nos ajudar. E é por meio dela que o historiador Daniel Gomes de Carvalho convida à reflexão, mostrando como o conhecimento filosófico nos ajuda a lidar com as questões mais inquietantes da vida: o bem e o mal, o amor, a política, a beleza e os rumos de nossa sociedade. E esse conhecimento, para Daniel, não está apenas nos grandes filósofos da história: está também em nossas séries preferidas, como Game of Thrones; está na música que não sai da nossa cabeça; está naquele quadro de que sempre ouvimos falar, mas nunca entendemos muito bem. A filosofia, essa área de conhecimento tão essencial e ao mesmo tempo tão subestimada, está por toda parte.",
                "https://images-na.ssl-images-amazon.com/images/I/91E1CK8On0S.jpg",
                categoryRepository.getById(12)));

        bookRepository.save(new Book(
                "Sobre a brevidade da vida: Edição Bilíngue com postal + marcador",
                21.99,
                "Sobre a brevidade da vida apresenta o pensamento de Sêneca, um dos principais nomes da filosofia estoica na história. Neste breve ensaio, o filósofo romano nos leva a refletir sobre uma questão fundamental para a humanidade: como usar o tempo em favor de uma vida plena e feliz. Tema universal e relevante até os dias de hoje. Esta é uma edição bilíngue, com nova tradução direta do latim, feita pelo professor Artur Costrino, mestre em Estudos Clássicos e ph.D. em Estudos Medievais. Além do texto original, a tradução traz notas explicativas para facilitar a compreensão da obra. Com estes escritos, Lúcio Aneu Sêneca se posiciona como um dos grandes expoentes da corrente filosófica estoica, ao lado do imperador Marco Aurélio. Uma obra fundamental para entendermos melhor esse importante movimento filosófico do Ocidente.",
                "https://images-na.ssl-images-amazon.com/images/I/81TNzkUcNzL.jpg",
                categoryRepository.getById(12)));

        bookRepository.save(new Book(
                "Órganon: Categorias - Da interpretação - Analíticos anteriores - Analíticos posteriores - Tópicos - Refutações Sofísticas",
                64.99,
                "Obra monumental na qual Aristóteles estabelece as bases da lógica formal. Está entre as mais importantes e complexas que nos foram legadas pelo Estagirita. A fim de facilitar e agilizar a consulta ao Órganon, fizemos constar à margem esquerda a consagrada numeração da edição referencial de 1831, de Bekker.",
                "https://images-na.ssl-images-amazon.com/images/I/81Je5YjtN8L.jpg",
                categoryRepository.getById(12)));

        bookRepository.save(new Book(
                "Textos básicos de filosofia: Dos pré-socráticos a Wittgenstein",
                38.33,
                "Essa antologia de textos dos grandes pensadores tem como objetivo pôr o estudante em contato direto com as fontes da filosofia ocidental. Em lugar de o aluno \"ouvir falar\" ou \"ler sobre\" a Alegoria da Caverna, por exemplo, terá oportunidade de conhecer o texto original de Platão. O professor Danilo Marcondes, com a experiência de mais de quinze anos de magistério, selecionou passagens onde se encontram alguns dos textos-chaves e argumentos centrais da tradição filosófica. Com finalidade didática, o volume inclui pequenas introduções aos filósofos e a cada um de seus textos, além de uma série de questões e temas para discussão em sala de aula ou em grupos de estudo. Agora professores e alunos já contam com um aparato completo para ensinar e estudar: Iniciação à história da filosofia, amplamente adotado e sucessivamente reeditado, e Textos básicos de filosofia formam um conjunto, o primeiro orientando o leitor nos caminhos da filosofia, o outro trazendo as fontes da filosofia ocidental.",
                "https://images-na.ssl-images-amazon.com/images/I/91p16q-LIiL.jpg",
                categoryRepository.getById(12)));

        // - Idiomas (13)
        bookRepository.save(new Book(
                "Espanhol - Coleção Curso Rápido de Idiomas",
                227.00,
                "Com exercícios ilustrados e frases que remetem a situações cotidianas, este título oferece um método eficiente, com duração de 12 semanas, para quem busca aprender o espanhol do zero ou reforçar seus conhecimentos. É composto por uma caixa que inclui três volumes - Livro do curso, Guia de conversação ilustrado e Gramática essencial -, que abordam conceitos de gramática e vocabulário, e três CDs de áudio, que permitem o treino da pronúncia com nativos.",
                "https://images-na.ssl-images-amazon.com/images/I/51SdXscZuoL.jpg",
                categoryRepository.getById(13)));

        bookRepository.save(new Book(
                "Guia de conversação Lonely Planet – Japonês",
                29.89,
                "Com o Guia de Conversação Japonês, da Lonely Planet, você vai pedir o prato que quiser nos restaurantes de Tóquio, vai andar de ônibus, metrô e barco em Kyoto, pedir informações e conversar com nativos em Yokohama e aprender frases fundamentais para se comunicar. Além de orientações sobre gramática, pronúncia e leitura do idioma japonês, o Guia de Conversação Japonês tem dicas culturais e de etiqueta para você fazer bonito no país do sol nascente.",
                "https://images-na.ssl-images-amazon.com/images/I/61e2bU7EaHL.jpg",
                categoryRepository.getById(13)));

        bookRepository.save(new Book(
                "Russo Essencial + CD",
                33.27,
                "A Série Essencial de idiomas, editada no Brasil pela Martins Fontes - selo Martins, traz para o estudante básico a oportunidade de desenvolver habilidades em um novo idioma. Seguindo um plano de atividades que aproxima o falante da língua do dia a dia, é possível determinar seu próprio ritmo para estudar espanhol, italiano ou russo. Cada livro acompanha um CD que permite que o leitor escute as sentenças e diálogos em sua pronúncia original e, assim, desenvolva o aprendizado com mais precisão e dinamismo. Para maior comodidade o CD de áudio é compatível com IPod e MP3. O estudante também dispõe de um glossário de termos e de um guia fonético para aperfeiçoar ainda mais as suas investigações.",
                "https://images-na.ssl-images-amazon.com/images/I/71yekVAeh6L.jpg",
                categoryRepository.getById(13)));

        bookRepository.save(new Book(
                "Como dizer tudo em inglês: livro de atividades",
                50.08,
                "O objetivo deste 'Como Dizer Tudo em Inglês - Livro de Atividades' é treinar conversação e fluência com os termos e expressões apresentados no primeiro livro. Acompanhando capítulo por capítulo o conteúdo do Como Dizer Tudo em Inglês, o livro oferece exercícios e atividades para treinar expressões e palavras. As atividades são diversificadas, podendo ser feitas tanto em sala de aula quanto individualmente. Um livro de atividades acompanha o livro original oferecendo exercícios e atividades para complementar o ensino das palavras e expressões no original.",
                "https://images-na.ssl-images-amazon.com/images/I/81ppHhcR2tL.jpg",
                categoryRepository.getById(13)));

        bookRepository.save(new Book(
                "Muito prazer - vol. único - livro do aluno: Fale o Português do Brasil",
                155.40,
                "Curso de Português para estrangeiros que tem como objetivo capacitar o aluno, de qualquer nacionalidade, a aprender o Português falado no Brasil e a comunicar-se com precisão e fluência. Com abordagem nova, combina as melhores caracteristicas das abordagens mais modernas de ensino de língua estrangeira.",
                "https://images-na.ssl-images-amazon.com/images/I/71aaM-z+q0L.jpg",
                categoryRepository.getById(13)));

        // - Cinema (14)
        bookRepository.save(new Book(
                "História do cinema mundial",
                55.99,
                "Fruto de três anos de profundas pesquisas, História do cinema mundial traz um viés inédito para o estudo do tema: o enfoque geográfico e cultural da sétima arte. Na primeira parte do livro, Franthiesco Ballerini explica como se formaram as principais indústrias cinematográficas do mundo, como Hollywood e Bollywood. Em seguida, passeia pelos movimentos cinematográficos mais emblemáticos do planeta – como o Neorrealismo italiano e a Nouvelle Vague francesa. Na terceira parte, o autor faz uma análise do melhor cinema feito em cada continente, especificando aspectos culturais, estéticos e de linguagem. Utilizando o didatismo que lhe é característico, Ballerini se dirige a estudantes de artes e comunicação, profissionais do cinema e do audiovisual, professores e artistas. Na obra, o leitor também encontrará: pequenas sinopses dos filmes mais importantes; curiosidades sobre os bastidores da indústria cinematográfica; listas com os filmes essenciais; lindas fotografias que ajudam a contar a história de cada capítulo; índice onomástico composto por todas as películas citadas e por diretores, atores e produtores.",
                "https://images-na.ssl-images-amazon.com/images/I/81z0efW6YdL.jpg",
                categoryRepository.getById(14)));

        bookRepository.save(new Book(
                "Da criação ao roteiro: Teoria e prática",
                83.50,
                "Depois de quarenta anos de uma vida dedicada ao ato de escrever para o cinema, o teatro e a televisão no Brasil e na Europa, Doc Comparato concebe uma nova visão do trabalho do roteirista. Nos apresenta de maneira única um novo recorte e panorama para quem quer se dedicar aos meios de comunicação no terceiro milênio. Nascem novas definições, atribuições e concepções, que abrangem exemplos e exercícios inovadores, aplicados em roteiros inéditos. A obra tem a missão de trazer o que existe de mais moderno na criação para streaming, realidade virtual, webséries, game e inteligência artificial, e aborda ainda contratos, adaptações, festivais, contatos profissionais, universitários e muito mais. De forma magistral, o atualíssimo Da criação ao roteiro mantém o equilíbrio entre o texto teórico e o pragmatismo do manual que ensina como fazer hoje e no futuro. O livro é uma ferramenta de conhecimento inesgotável para profissionais e estudantes.",
                "https://images-na.ssl-images-amazon.com/images/I/712894TP2QL.jpg",
                categoryRepository.getById(14)));

        bookRepository.save(new Book(
                "Como falar sobre cinema: Um guia para apreciar a sétima arte",
                30.50,
                "Seja na tentativa de impressionar alguém após a exibição de um filme de arte ou ao discutir as indicações ao Oscar entre amigos, a maioria das pessoas gosta de descobrir maneiras de ver e falar sobre cinema. Mas com tanta variedade, entre thrillers de Alfred Hitchcock e comédias românticas de Nora Ephron, como os espectadores podem determinar o que torna um filme realmente bom? Em Como falar sobre cinema: Um guia para apreciar a sétima arte, a crítica de cinema do The Washington Post e indicada ao Pulitzer de melhor crítica Ann Hornaday nos conduz pelos aspectos da produção de um filme – do roteiro e elenco à edição de som – e explica como avaliar cada etapa do processo. Como saber se um filme foi bem escrito, para além de diálogos rápidos? O que constitui uma ótima atuação? O que torna uma fotografia, edição e edição de som notáveis? E o que realmente faz um diretor? A autora nos oferece essas respostas e nos mostra como a experiência de assistir a um filme pode ser muito mais rica do que imaginávamos. Apresentando curiosidades e entrevistas com atores e cineastas, Como falar sobre cinema vai ajudar você a enxergar o cinema sob uma luz totalmente nova – não apenas como fã, mas como um autêntico crítico de cinema.",
                "https://images-na.ssl-images-amazon.com/images/I/71Twlx-TiiS.jpg",
                categoryRepository.getById(14)));

        bookRepository.save(new Book(
                "Friends forever – aquele sobre os episódios; o livro oficial dos 25 anos de Friends: 1",
                125.22,
                "O LIVRO OFICIAL DOS 25 ANOS DE FRIENDS EM UMA EDIÇÃO ESPECIAL DE COLECIONADOR! Friends apresentou ao mundo seis melhores amigos que poderiam ser os seus melhores amigos. Ou os da sua tia. Ou os do seu vizinho. Com um enredo tão simples, talvez poderia ter dado tudo errado nas mãos de outras pessoas, e nós não teríamos este livro. Mas Friends caiu nas mãos certas… tanto daqueles que conhecemos tão bem da TV quanto dos que trabalharam nos bastidores. E aí tudo aconteceu. Friends se tornou uma das comédias mais queridas da atualidade e resistiu ao tempo. Qual outro programa de TV consegue agradar tanto a geração X como aos Millennials, e influenciou não só outros seriados como até nosso jeito de falar? Ou você nunca ficou na Friendzone ou não tem um BFF? Difícil não pensar nos nossos 20 e poucos anos e não associar alguma situação da nossa própria vida com Rachel, Monica, Phoebe, Joey, Chandler e Ross. Difícil também escolher algum preferido, porque o que amamos em Friends é justamente ver os seis juntos. Pegue uma xícara gigante de café e prepare-se, porque, quando abrir estas páginas, certamente vão rolar risos e quem sabe algumas lágrimas de nostalgia também.",
                "https://images-na.ssl-images-amazon.com/images/I/916jlX+JqJL.jpg",
                categoryRepository.getById(14)));

        bookRepository.save(new Book(
                "O que é o cinema?",
                55.22,
                "Clássico dos clássicos entre os escritos sobre cinema, este livro é uma aula sobre a sétima arte e suas relações com fotografia, teatro e literatura, e, sobretudo, uma escola definitiva sobre o fazer crítico. A variedade de temas caros à história do cinema neste volume indica a versatilidade e a generosidade de André Bazin. Com um estilo claro e acessível, ele transita das escolas italiana e soviética ao universo do western e das pin-ups, o que fez com que, merecidamente, tenha se transformado num dos maiores críticos modernos. Considerado um dos maiores críticos do pós-guerra, Bazin produziu a maior parte dos textos reunidos aqui no contexto dos cineclubes parisienses, entre 1945 e 1958. Fundador da revista francesa Cahiers du Cinéma, o crítico esteve na linha de frente da produção cinematográfica do período, convivendo com cineastas como os jovens Jean-Luc Godard, Eric Rohmer e François Truffaut, seu filho adotivo. Mais tarde, os cineastas dessa geração tomariam Bazin como mentor da nouvelle vague. A presente edição reune 36 textos de André Bazin, bem como uma apresentação e um apêndice assinado pelo crítico e professor de cinema Ismail Xavier, que dá conta da influência bazaniana na teoria e crítica de cinema em nosso país, em especial, personificada na figura de Paulo Emílio Sales Gomes.",
                "https://images-na.ssl-images-amazon.com/images/I/911Gxw+XeaL.jpg",
                categoryRepository.getById(14)));

        // - Pedagogia (15)
        bookRepository.save(new Book(
                "Pedagogias do Século XXI: Bases para a Inovação Educativa",
                42.38,
                "Quais são os novos discursos e práticas pedagógicas que estão emergindo e iluminando este século? Quais são as identidades, referências e experiências mais emblemáticas dessas pedagogias na história recente da educação? O que trazem de novo e o que desejam rever? Esta obra apresenta ao leitor iniciativas que se preocupam em melhorar as relações educativas e conseguir um ambiente escolar mais amável; em fomentar a cooperação, a participação e a democratização da gestão escolar diária; em estimular o protagonismo dos alunos e sua curiosidade pelo conhecimento; em transformar a sala de aula em um espaço de pesquisa e diálogo; em aproximar a escola da realidade e vice-versa, para que tudo aquilo que se ensine e aprenda seja estimulante e faça sentido para a formação de uma futura cidadania mais livre, responsável, criativa e crítica e, finalmente, para que a escola seja mais educativa.",
                "https://images-na.ssl-images-amazon.com/images/I/81lEo38amCL.jpg",
                categoryRepository.getById(15)));

        bookRepository.save(new Book(
                "Brincar é fundamental: Como entender o neurodesenvolvimento e resgatar a importância do brincar durante a primeira infância",
                20.20,
                "“Você e a sua criança precisam remar juntos, como se estivessem em uma canoa, se quiserem avançar e chegar a algum lugar”. – Luciana Brites “Nos primeiros anos de vida, o brincar representa uma situação de criatividade espontânea que enriquece o conhecimento, a sociabilidade e as funções cerebrais no processo de aprendizagem. Ao brincar, a criança emite criatividade, expressa fantasias, sensações, e emoções internas e adquire maturidade, resultados esses que a gratificam continuamente. Em Brincar é fundamental, Luciana Brites nos ajuda a compreender melhor o processo de aprendizagem e a importância dos estímulos adequados na primeira infância a partir dos aspectos anatomofuncionais do sistema nervoso, como a linguagem, a audição e a visão. Além de reunir referências de publicações de renomados pesquisadores da área, a autora constrói, em linguagem acessível, um guia prático destinado a mães, pais, educadores e profissionais que lidam com crianças que desejam compreender melhor o desenvolvimento na primeira infância.” – Profa. Dra. Maria Valeriana Leme de Moura Ribeiro, neurologista infantil Neste livro você vai aprender: 1. A identificar e a compreender as etapas do neurodesenvolvimento da criança; 2. Quais são os estímulos adequados para a criança na primeira infância; 3. Como otimizar o desenvolvimento do seu filho, aluno ou criança com a qual convive; 4. Entender os aspectos que ajudam na estimulação das crianças: aprendizagem, brincadeira, cognição e desenvolvimento; 5. A importância do desenvolvimento adequado na primeira infância para que a criança se torne um adulto pleno, realizado e feliz",
                "https://images-na.ssl-images-amazon.com/images/I/8100KHaVtxL.jpg",
                categoryRepository.getById(15)));

        bookRepository.save(new Book(
                "Alfabetizar e letrar: Um diálogo entre a teoria e a prática",
                27.89,
                "Neste livro, a autora argumenta que é possível alfabetizar crianças e adultos, isto é, ensinar-lhes o código alfabético, e, ao mesmo tempo, com a mesma ênfase, convidá-los a participar da aventura do conhecimento implícita no ato de ler.",
                "https://images-na.ssl-images-amazon.com/images/I/81StNtKgkiL.jpg",
                categoryRepository.getById(15)));

        bookRepository.save(new Book(
                "Pedagogia e pedagogos, para quê?",
                32.90,
                "O livro discute questões relacionadas com o campo teórico da Pedagogia, a prática educativa como seu objeto, a relação com as demais ciências da educação, a identidade profissional do pedagogo e seu papel diante das realidades contemporâneas.",
                "https://images-na.ssl-images-amazon.com/images/I/A1bIhfBWbML.jpg",
                categoryRepository.getById(15)));

        bookRepository.save(new Book(
                "Comunicação não violenta - Nova edição: Técnicas para aprimorar relacionamentos pessoais e profissionais",
                49.86,
                "Em um mundo violento, cheio de preconceitos, conflitos e mal-entendidos, buscamos ansiosamente soluções para melhorar nossa relação com os outros. Nesse sentido, a boa comunicação é uma das armas mais eficazes. Grande parte dos problemas entre casais, pais e filhos, empregados e empregadores, vizinhos, políticos e governantes pode ser amenizada e frequentemente evitada apenas com... palavras. Porém, saber ouvir o que de fato está sendo dito pelo outro e expressar o que de fato queremos dizer, embora pareça tarefa simples, é das mais difíceis. Nesta obra, best-seller no Brasil e no mundo, Marshall Rosenberg explica de maneira revolucionária os valores e princípios da comunicação não violenta, que se baseia em habilidades de linguagem e comunicação que fortalecem nossa capacidade de manter a humanidade, mesmo em condições adversas. Usando sua experiência como psicólogo clínico e criador do método da CNV, ele ensina o leitor a: • entregar-se de coração aos relacionamentos e se libertar dos condicionamentos e dos efeitos de experiências passadas; • identificar e expressar sentimentos; • expressar a raiva de forma não violenta; • transformar padrões negativos de pensamento; • resolver seus conflitos com os outros de forma pacífica; • criar relacionamentos interpessoais baseados em respeito mútuo, compaixão e cooperação. Nesta nova edição, que conta com um capítulo inédito sobre mediação e solução de conflitos e prefácio de Deepak Chopra, Marshall Rosenberg consolida seu trabalho, reconhecido mundialmente, e compartilha com os leitores ensinamentos testados e comprovados na prática.",
                "https://images-na.ssl-images-amazon.com/images/I/71ZS-B3zscS.jpg",
                categoryRepository.getById(15)));

        // - Saúde (16)
        bookRepository.save(new Book(
                "Saúde perfeita (edição de bolso)",
                25.89,
                "O autor best-seller Deepak Chopra traz cura, rejuvenescimento e bem-estar nesta obra em formato de bolso. Reconhecido por seu pioneirismo ao abordar o tema do poder de cura da mente, o médico indiano Deepak Chopra recomenda os princípios da medicina tradicional indiana para superar as limitações da doença e do envelhecimento.Publicado originalmente em 1990, o livro Saúde perfeita tornou-se um best-seller mundial ao descortinar as práticas do Ayurveda. Esta edição de bolso inclui as pesquisas médicas mais recentes sobre a medicina tradicional indiana, além de técnicas novas desenvolvidas pelo autor em seu centro de medicina ayurvédica. Obra essencial para quem busca vida saudável e equilíbrio das funções vitais do organismo.",
                "https://images-na.ssl-images-amazon.com/images/I/71oVbkVTrxL.jpg",
                categoryRepository.getById(16)));

        bookRepository.save(new Book(
                "A dieta da mente (Edição revista e atualizada): Descubra os assassinos silenciosos do seu cérebro",
                34.29,
                "Nesta edição ampliada de seu best-seller A dieta da mente, o dr. David Perlmutter volta a chamar atenção para um segredo que só começou a ser revelado recentemente: o destino do seu cérebro não está na sua genética, mas naquilo que você come. E os carboidratos são os grandes vilões; até mesmo aqueles considerados “saudáveis”, como os grãos integrais, podem causar Alzheimer, ansiedade, depressão, enxaquecas, redução de libido e muitos outros males. Como escapar dessa armadilha e se manter saudável? A resposta do dr. Perlmutter é simples: uma dieta rica em “gorduras boas” e práticas que estimulam a regeneração neuronal em qualquer idade. Para isso, ele propõe um revolucionário programa de quatro semanas que aponta o caminho para manter o cérebro sadio, vibrante e aguçado ― sem medicamentos. Com novas descobertas científicas, histórias reais de transformação, conselhos práticos e acessíveis, receitas deliciosas incluídas nesta edição e metas semanais, este livro vai ajudá-lo a assumir o controle dos seus genes, recuperar o bem-estar e manter a saúde e a vitalidade por toda a vida. “A nova edição de A dieta da mente é brilhante, acessível e revolucionária. Seguindo os conselhos científicos deste livro, você pode ter um corpo e um cérebro mais saudáveis a partir de hoje.” ― Dr. Daniel G. Amen, autor de Mude seu cérebro, mude seu corpo e Use seu cérebro para mudar sua idade",
                "https://images-na.ssl-images-amazon.com/images/I/718QOzHpJZL.jpg",
                categoryRepository.getById(16)));

        bookRepository.save(new Book(
                "Bases bioquímicas e fisiológicas da nutrição: Nas diferentes fases da vida, na saúde e na doença",
                125.98,
                "A área do conhecimento da Ciência da Nutrição é bastante ampla, multidisciplinar e interprofissional. Bases bioquímicas e fisiológicas da nutrição: nas diferentes fases da vida, na saúde e na doença se dirige aos interessados em obter, em uma única obra, material que contemple não somente aspectos básicos e informações científicas clássicas, como também as descobertas mais recentes da Nutrição. Nessa 2ª edição, toda a obra foi minuciosamente revisada, trazendo o que há de mais novo na área. Além disso, foram adicionados cinco capítulos, em razão do cenário científico atual: “Anemias”; “Doença celíaca e outros distúrbios associados ao glúten”; ”Nutrição e doenças inflamatórias intestinais”; ”Intolerância à lactose”; e “Nutrição e microbiota intestinal”. O livro está dividido em 4 partes: • Macronutrientes, produção de energia, fibra alimentar e equilíbrio hidroeletrolítico e acidobásico • Micronutrientes e compostos bioativos de alimentos • Nutrição nas diferentes fases da vida • Nutrição na saúde e na doença Cada um dos capítulos foi cuidadosamente elaborado para atender às necessidades de estudantes de graduação, de pós-graduação e de profissionais nas áreas da Bioquímica e da Fisiologia da Nutrição. Trata-se, portanto, de obra de referência para a área, de importância ímpar para a literatura científica do Brasil.",
                "https://images-na.ssl-images-amazon.com/images/I/81gRoSvaXVL.jpg",
                categoryRepository.getById(16)));

        bookRepository.save(new Book(
                "Análise do comportamento aplicada ao transtorno do espectro autista: Volume 1",
                75.47,
                "O livro Análise do Comportamento Aplicada ao Transtorno do Espectro Autista é pioneiro em apresentar, em língua portuguesa, material sobre o tratamento mais eficaz para pessoas com Transtorno do Espectro Autista (TEA): aquele baseado na ciência Análise do Comportamento Aplicada (ABA, do inglês Applied Behavior Analysis). A superioridade do tratamento baseado na ABA sobre outras formas de terapia para remediar os déficits associados ao TEA tem sido demonstrada por pesquisas realizadas nos últimos 50 anos. Por essa razão, atualmente, tratamentos baseados na ABA têm sido recomendados por organizações, como o Conselho Nacional Americano de Pesquisa e a Associação Americana de Pediatria.O conteúdo do livro foi escolhido com base em periódicos que, reconhecidamente, produzem conhecimento de ponta na ABA, como o Journal of Applied Behavior Analysis e o Behavior Analysis in Practice e, concomitantemente, os documentos da Behavior Analyst Certification Board (BACB®). Os capítulos introduzem os conceitos de forma gradual, partindo das conceituações de TEA, de Análise do Comportamento e da ABA, passando por suas bases filosóficas, conceitos básicos e procedimentos de ensino gerais, até chegar a intervenções específicas para o tratamento de déficits e de excessos que costumam ser observados em pessoas com TEA, tais como emissão de comportamentos-problema, distúrbios de alimentação e de linguagem.Os autores de cada capítulo foram cuidadosamente escolhidos de acordo com suas especializações para abordar um determinado tema, o que resultou na participação de pesquisadores e clínicos de diferentes instituições do Brasil e dos Estados Unidos, reconhecidos, nacional e internacionalmente, por suas contribuições para a área e em material de altíssima qualidade.Dessa maneira, estudantes de graduação, de pós-graduação e profissionais de diferentes áreas interessados no tratamento de TEA encontrarão informações necessárias tanto para aqueles que estão iniciando seus estudos sobre a ABA quanto para aqueles que já possuem algum conhecimento sobre essa ciência.",
                "https://images-na.ssl-images-amazon.com/images/I/817HZ9lQnFL.jpg",
                categoryRepository.getById(16)));

        bookRepository.save(new Book(
                "Manual Clínico dos Transtornos Psicológicos: Tratamento Passo a Passo",
                126.95,
                "Com foco na prática baseada em evidências, esta é uma obra de referência para profissionais e estudantes da área da saúde mental interessados em saber “como se faz”. Guia de excelência para o diagnóstico e o tratamento dos transtornos psicológicos mais frequentes em adultos, este livro chega à sua quinta edição amplamente revisado, contemplando os avanços provenientes da pesquisa e da clínica e as mudanças nos critérios diagnósticos do DSM-5. Além de novos capítulos que apresentam protocolos de tratamento para a insônia e para o transtorno de ansiedade generalizada, aborda também a combinação de tratamentos para casos de depressão e abuso de substâncias.",
                "https://images-na.ssl-images-amazon.com/images/I/81-apWjsu7L.jpg",
                categoryRepository.getById(16)));

        // - Psicologia (17)
        bookRepository.save(new Book(
                "Poesia que Transforma",
                19.87,
                "Esse livro é uma homenagem à poesia e a tudo o que ela é capaz de proporcionar. Com mais de 30 de seus emocionantes poemas, alguns deles inéditos, Bráulio Bessa nos conta um pouco das histórias do menino de Alto Santo, no interior do Ceará, que se tornou poeta e ativista cultural. Desde o primeiro encontro com a obra de Patativa do Assaré, aos 14 anos, até a fama na televisão, ele mostra como a poesia transformou sua vida. Com ilustrações do artista baiano Elano Passos, o livro traz ainda depoimentos de fãs de todos os cantos do Brasil, revelando como as palavras de Bráulio são capazes de inspirar pequenas e grandes mudanças.",
                "https://images-na.ssl-images-amazon.com/images/I/61kzpMiq+gL.jpg",
                categoryRepository.getById(17)));

        bookRepository.save(new Book(
                "Mindset: A nova psicologia do sucesso",
                38.30,
                "Carol S. Dweck, ph.D., professora de psicologia na Universidade Stanford e especialista internacional em sucesso e motivação, desenvolveu, ao longo de décadas de pesquisa, um conceito fundamental: a atitude mental com que encaramos a vida, que ela chama de “mindset”, é crucial para o sucesso. Dweck revela de forma brilhante como o sucesso pode ser alcançado pela maneira como lidamos com nossos objetivos. O mindset não é um mero traço de personalidade, é a explicação de por que somos otimistas ou pessimistas, bem-sucedidos ou não. Ele define nossa relação com o trabalho e com as pessoas e a maneira como educamos nossos filhos. É um fator decisivo para que todo o nosso potencial seja explorado.",
                "https://images-na.ssl-images-amazon.com/images/I/71Ils+Co9fL.jpg",
                categoryRepository.getById(17)));

        bookRepository.save(new Book(
                "O palhaço e o psicanalista: Como escutar os outros pode transformar vidas",
                34.90,
                "Se de médico e louco todo mundo tem um pouco, de psicanalista e palhaço todo mundo tem um pedaço. Christian Dunker e Cláudio Thebas abordam neste livro, com bom humor e profundidade, um tema comum para ambos os ofícios: como escutar os outros? Como escutar a si mesmo? E como a escuta pode transformar pessoas? Mesclando experiências, testemunhos, casos e reflexões filosóficas, os autores compartilham o que aprenderam sobre A ARTE DA ESCUTA, um tema tão urgente no mundo atual, onde ninguém mais se escuta. Alguns temas abordados: Sete regras para ser melhor escutado / Os quatro agás da escuta / A potência do silêncio / Simpatia não é empatia / Como construir para si um órgão de escuta / Cuidado ou controle / A arte cavalheiresca de escutar uma reunião / Educados para a solidão silenciosa / Competir ou cooperar? / Três perguntas mágicas A arte de perguntar / Fala que eu não te escuto / Maneiras práticas de domesticar o abominável que existe em você / Escutando classes, gêneros, raças e outras diversidades / A escuta em ambiente digital / Escutando chatos, fascistas e outros fanáticos / O líder escutador / A coragem e o desejo de escutar / ",
                "https://images-na.ssl-images-amazon.com/images/I/81LCThl+U9L.jpg",
                categoryRepository.getById(17)));

        bookRepository.save(new Book(
                "Guia de Terapia Cognitivo-Comportamental para o Terapeuta: A Mente Vencendo o Humor",
                95.00,
                "Neste Guia de terapia cognitivo-comportamental para o terapeuta, Christine A. Padesky e Dennis Greenberger apresentam orientações de como os terapeutas podem trabalhar os capítulos de A mente vencendo o humor para auxiliar clientes com diferentes problemas emocionais – ansiedade, depressão, raiva, culpa, vergonha, problemas de relacionamento e transtornos da personalidade. Além de diálogos terapeuta-cliente convincentes, que ilustram vividamente as intervenções centrais da terapia cognitivo-comportamental (TCC) e o manejo de situações desafiadoras, este livro, também disponível no formato ebook, traz uma ampla cobertura sobre o uso eficaz de registros de pensamento e experimentos comportamentais, incluindo, ainda, práticas baseadas em evidências de psicologia positiva, entrevista motivacional e terapia de aceitação e compromisso.",
                "https://images-na.ssl-images-amazon.com/images/I/41gdkUGKTUL.jpg",
                categoryRepository.getById(17)));

        bookRepository.save(new Book(
                "A síndrome da boazinha: Como curar sua compulsão por agradar",
                44.46,
                "Descubra como curar sua compulsão por agradar e valorizar os seus desejos! As mulheres que sofrem dessa compulsão não são apenas as que se desdobram para garantir que todos à sua volta estejam felizes. Na verdade, aquelas que padecem desta síndrome passam por um sofrimento cotidiano ao esgotarem seu tempo e sua energia realizando tarefas desnecessárias apenas porque não sabem dizer “não”. Quando ajudar os outros se torna um comportamento compulsivo e não se consegue negar pedidos e exigências feitas por terceiros, a vida se torna um exercício diário de frustração. Para ajudar a superar este mal, a Dra. Harriet B. Braiker traz em A síndorme da boazinha uma análise criteriosa da compulsão por agradar e oferece um plano de ação de 21 dias para que você possa se curar rapidamente. Aprender a dizer “não”, obter a aprovação de si mesma e não fugir de conflitos são os primeiros passos para uma vida plena de realização e autoestima.A partir de histórias reais vividas no consultório da autora e de uma análise sobre a compulsão por agradar, A síndrome da boazinha procura estabelecer novos parâmetros na vida de quem sofre deste mal. Este livro vai ajudar você a identificar os momentos em que os outros abusam de sua bondade e mostrar que a própria aprovação é muito mais importante do que a de qualquer outra pessoa. Você perceberá que viver de forma equilibrada, levando a opinião dos outros em consideração, sem que ela tenha necessariamente que se sobrepor à sua vontade, é a melhor maneira para ser saudável e feliz.A síndrome da boazinha é a leitura ideal para você que deseja validar as suas vontades, encontrar a sua autoestima e se tornar a melhor versão de você mesma!",
                "https://images-na.ssl-images-amazon.com/images/I/71QRHB9PAcL.jpg",
                categoryRepository.getById(17)));

        // - Política (18)
        bookRepository.save(new Book(
                "Política é para todos",
                23.30,
                "O que é uma democracia e para que serve uma constituição? Quais são as atribuições de cada uma das três esferas de poder e como garantir que elas se mantenham em harmonia? Como funcionam as eleições e qual a importância das fake news nesse cenário? Em Política é para todos, a advogada e apresentadora Gabriela Prioli responde a essas e outras questões imprescindíveis para a compreensão do funcionamento da política ― sobretudo a brasileira ―, mas que muitas pessoas têm receio ou vergonha de perguntar. Com a linguagem descomplicada que fez dela uma das personalidades mais populares do país, a autora mostra como cada um de nós pode se engajar para construir a sociedade que queremos, debatendo os assuntos relevantes com opiniões próprias e argumentos racionais.",
                "https://images-na.ssl-images-amazon.com/images/I/61QDJdGB6cS.jpg",
                categoryRepository.getById(18)));

        bookRepository.save(new Book(
                "Os Paradoxos da Justiça: Judiciário e Política no Brasil",
                53.62,
                "A EDITORA CONTRACORRENTE tem a satisfação de publicar o livro OS PARADOXOS DA JUSTIÇA: JUDICIÁRIO E POLÍTICA NO BRASIL do prestigiado autor MARCELO SEMER. A presente obra representa uma quebra de silêncio dentro de uma das instituições mais importantes do país e, ao mesmo tempo, uma das mais autoritárias e patriarcais, qual seja: o Poder Judiciário. O leitor tem em mãos um corajoso diagnóstico sobre as maiores contradições encontradas no Judiciário brasileiro. Nas palavras do prefaciador desse livro, o consagrado jurista Rubens Casara: “A crise de confiança no Judiciário, a tendência populista, a ideologia punitivista, as práticas autoritárias e a contribuição dos juízes brasileiros à derrocada do Estado Democrático de Direito, dentre outras distorções, são analisadas com profundidade e clareza neste livro, que nasce com a vocação de se tornar um clássico”.",
                "https://images-na.ssl-images-amazon.com/images/I/91oT4AlXfnS.jpg",
                categoryRepository.getById(18)));

        bookRepository.save(new Book(
                "Politica ideologia e conspirações",
                23.50,
                "Sempre ouvimos teorias sobre conspirações guiando o mundo, comandadas pelo establishment político, ditadas por sociedades secretas, confrarias, religiões e organizações à sombra do Estado. No entanto, nunca eram apresentadas provas, documentos que atestassem a real existências das tramas. Até agora. Este livro mostra que, além de existirem, não se trata de algo secreto nem discreto, mas de uma guerra aberta, declarada e constante, que nos distrai com sua tática de colocar socialistas contra liberais, esquerda contra direita, capitalismo vs comunismo. Fomos divididos em torcidas de uma falsa disputa, e os que realmente vencem nem precisam entrar em campo, sempre estiveram juntos em um terceiro lado, que não estava disputando nada, apenas nos ocupando enquanto mantinham o poder. São os grandes banqueiros e elites globais que dirigem o mundo. Não à toa eles se vendem como socialistas, benevolentes e altruístas, há método nisso tudo: decidem as opções que você tem para votar, em que causas acredita, quais alimentos são saudáveis e o que deve consumir em todos os aspectos: bens móveis, imóveis e culturais. Famílias como Rockefeller, Morgans, Rothschilds e grupos como Bildeberg, Frankfurt e outros super-ricos são os personagens daqui, sempre ligados a figuras como Lênin, Trótski, Mao Tsé-Tung, Hitler, Karl Marx e tantos outros. Com as revelações apresentadas, pode-se decidir, com mais consciência, de quais causas, movimentos e ideais realmente vale a pena participar.",
                "https://images-na.ssl-images-amazon.com/images/I/81zcxJMUR7S.jpg",
                categoryRepository.getById(18)));

        bookRepository.save(new Book(
                "Dinheiro, eleições e poder: As engrenagens do sistema político brasileiro",
                46.65,
                "Diante do cenário político e econômico atual, muitos autores têm procurado discutir se nosso presidencialismo de coalizão funciona. Bruno Carazza foi além, avaliando quais são os custos de seu precário funcionamento. Especialista em direito e economia, Bruno Carazza criou uma metodologia original para destrinchar as engrenagens do sistema político brasileiro. Para escrever Dinheiro, eleições e poder, ele compilou e cruzou um volume imenso de dados sobre doações de campanhas eleitorais, tramitação de projetos, votações e atuação parlamentar, que são contextualizados por fragmentos das delações premiadas e dos depoimentos de testemunhas ouvidas nas várias fases da Operação Lava Jato e do julgamento da chapa Dilma-Temer no TSE. O autor mostra como o perfil do financiamento eleitoral no Brasil foi se concentrando em grandes doadores, que seguem uma lógica estritamente empresarial – muito mais que ideológica. Baseado em dados sobre participação em frentes parlamentares, propositura de emendas e posicionamento nas principais votações, Carazza analisa como os eleitos tendem a retribuir as doações recebidas das grandes empresas. Por fim, o autor apresenta alternativas para baratear nossas eleições, combater práticas como o “caixa dois” e diminuir a influência econômica em nossa democracia.",
                "https://images-na.ssl-images-amazon.com/images/I/81m8KPGdZTL.jpg",
                categoryRepository.getById(18)));

        bookRepository.save(new Book(
                "Política",
                44.99,
                "Esta obra primordial da cultura clássica encanta a todos os que buscam compreender a formação, a estrutura e o desenvolvimento da vida em comunidade. Para Aristóteles, o principal motivo desta associação humana é o bem comum, capaz de proporcionar felicidade aos seus cidadãos e prosperidade à cidade. A instituição de leis e a sua observância são fundamentais para que a cidade seja uma associação humana feliz e próspera. Inclui apêndice com a tradução de “Da Monarquia, Democracia e Oligarquia”, de Plutarco.",
                "https://images-na.ssl-images-amazon.com/images/I/71uFX2qb9rL.jpg",
                categoryRepository.getById(18)));

        // - Moda (19)
        bookRepository.save(new Book(
                "História social da moda",
                64.99,
                "A história do vestuário diz muito sobre a sociedade e seu tempo. Nesse livro, a autora traça um interessante panorama da origem da moda e de sua evolução ao longo da história. Conta, entre outras coisas, como os vestuários masculino e feminino passaram a diferenciar-se, como a Igreja tentou conter os modismos na Idade Média e por que só pode existir moda em sociedades cuja estrutura não é estática. Fundamental para entender o espaço cada vez maior que a moda ocupa hoje na nossa sociedade.",
                "https://images-na.ssl-images-amazon.com/images/I/A1cpZZHRkKL.jpg",
                categoryRepository.getById(19)));

        bookRepository.save(new Book(
                "Vogue on Coco Chanel",
                81.06,
                "In Vogue on Coco Chanel, acclaimed fashion writer and commentator Bronwyn Cosgrave traces the story of Coco Chanel's iconic designs and glamorous, racy life. Featuring original illustrations and images from celebrated photographers, such as Cecil Beaton, the book provides a completely fresh look at the fashion designer, who is arguably 'the most influential female designer of the twentieth century'. Coco Chanel pioneered classic easy-to-wear fashion for the modern woman. Perhaps her most important contribution to the fashion world was the simple, much-imitated 'little black dress', which made its debut in 1926. Other landmark creations include the Chanel suit and the quilted handbag. It is a testament to her lasting influence that these legendary designs remain as popular today as when they first appeared.",
                "https://images-na.ssl-images-amazon.com/images/I/71zQw3UM2ZL.jpg",
                categoryRepository.getById(19)));

        bookRepository.save(new Book(
                "Dior for ever",
                156.05,
                "Sempre lançando tendências, Christian Dior buscou inspiração nas flores e nas curvas do corpo feminino e aliou delicadeza em suas criações. Desde a elaboração do New Look, a marca Dior tornou-se sinônimo de elegância, e personalidades do mundo todo passaram a desejar se vestir com a grife. Por meio de fotos e fac-símiles de croquis, convites de desfile, catálogos e material de divulgação, este livro apresenta a pesquisa realizada pela historiadora de moda Catherine rmen de quase setenta anos da maison Dior, mostrando a construção e a evolução da marca até as roupas assinadas por Raf Simons.",
                "https://images-na.ssl-images-amazon.com/images/I/710KzyogC8L.jpg",
                categoryRepository.getById(19)));

        bookRepository.save(new Book(
                "Questão de estilo: 20 itens icônicos que mudaram a história da moda",
                30.15,
                "Este livro traz vinte ícones criados por artistas excepcionais e que resumem, em linhas sucintas e refinadas, as características de um ?clássico de grife?. São vinte referências de moda e estilo, expressas em várias formas e cores. Alguns artigos são exclusivos, outros fazem parte do nosso cotidiano; todos, entretanto, são marcados por histórias de coragem e empreendedorismo. Questão de estilo tem como objetivo, assim, definir o que é essencial na moda.",
                "https://images-na.ssl-images-amazon.com/images/I/81sZfz5YnAL.jpg",
                categoryRepository.getById(19)));

        bookRepository.save(new Book(
                "O Evangelho de Coco Chanel: Lições de Vida da Mulher Mais Elegante do Mundo",
                21.10,
                "Chanel não foi somente a mulher que criou e imortalizou o “pretinho básico”, também popularizou as calças femininas e roupas fáceis e práticas que deixavam as mulheres chiques e confortáveis. Com sua personalidade forte e decidida, elegante e passional, de um jeito totalmente francês, Coco conduziu as mulheres diretamente para uma nova era. O Evangelho de Coco Chanel é um cativante olhar sobre o estilo, a fama e o talento de um dos maiores ícones da moda. Dividindo a biografia de Chanel em capítulos temáticos – como elegância, paixão, dinheiro, sucesso – que sutilmente ensinam lições de vida, com comentários divertidos e maravilhosas ilustrações, Karen Karbo irá inspirar os leitores com uma história impressionante de reinvenção, confiança e determinação.",
                "https://images-na.ssl-images-amazon.com/images/I/71EJeI5LfBL.jpg",
                categoryRepository.getById(19)));

        // - Turismo (20)
        bookRepository.save(new Book(
                "Lonely Planet Leste Europeu",
                82.40,
                "Quem já leu ou viu Drácula, de BramStoker, pode imaginar as emoções que aguardam o viajante na misteriosa Transilvânia, na Romênia. Ir até essa lendária região de trem, cruzando os majestosos Cárpatos, rios de águas azuis e castelos medievais, já é uma senhora aventura. E apenas uma das muitas experiências inesquecíveis que você pode viver nos 21 países minuciosamente explorados no novo guia Lonely Planet: Leste Europeu, publicado neste mês pela Globo Livros. Em suas mais de 900 páginas, o livro percorre Rússia, Estônia, Letônia, Lituânia, Belarus, Polônia, Ucrânia, República Tcheca, Eslováquia, Moldávia, Hungria, Romênia, Eslovênia, Croácia, Bósnia e Herzegovina, Montenegro, Sérvia, Bulgária, Kosovo, Macedônia e Albânia, mostrando as suas principais atrações e os melhores lugares para se hospedar, comer e passear. Há um capítulo detalhado dedicado a cada país, além de seções gerais que ajudam o leitor a decidir o seu roteiro. Atrações não faltam: do museu Hermitage, um dos mais celebrados do mundo, na cidade russa de São Pertersburgo, às praias do mar Negro, na Bulgária, o viajante não se cansará das belezas de uma região esculpida ao longo de séculos de uma história riquíssima de impérios magnânimos, guerras impiedosas, comunismo e muita, muita cultura. A arquitetura, por si só, já vale a viagem: muralhas da Idade Média dividem espaço com bairros otomanos, como o charmoso Mostar, na Bósnia e Herzegovina, e a sofisticação do estilo art nouveau, que é um dos destaques de Riga, capital da Letônia. Na Albânia, você pode visitar a “cidade das mil janelas”, a bucólica Berat. E aquele jeitão de Velho Mundo? Rume para a espetacular Dubrovnik, na Croácia. Não pense, porém, que é preciso ser fã de história e arte para aproveitar a região. Se você faz o tipo esportista, pode pedalar pelo istmo da Curlândia, na Lituânia, e ganhar um bom causo para contar pelo resto da vida. Caminhadas pelos Tatras, na Eslováquia, que estão entre as mais altas montanhas dos Cárpatos, é outra opção sob medida para os que buscam adrenalina. Amantes de passeios ao ar livre ficarão impressionados com a generosidade da mãe natureza nos Bálcãs: não percam as paisagens surreais de Montenegro, como a Baía de Kotor. Para os que gostam de agito, que tal badalar na Riviera Croata, pontilhada por iates, ou aproveitar as Noites Brancas do verão russo? Moscou, com sua magnífica Praça Vermelha, a polonesa Cracóvia e, claro, Praga, a “Paris do Leste”, não deixarão você descansar nem um minuto. Tallinn, na Estônia, desponta como o próximo destino da moda. E Budapeste, cortada pelo famoso rio Danúbio, tem balada e muito romantismo – fica a gosto do freguês. Ao final de cada capítulo, na seção “Entenda”, todos os países ganham um resumo de sua trajetória, para que o leitor aprenda o básico sobre cada destino. No utilíssimo “Guia de Sobrevivência”, você se informa sobre o funcionamento de hotéis, restaurantes e do transporte público, as formas de pagamento aceitas, os feriados nacionais, os possíveis cuidados que deve tomar e outros dados práticos que facilitam, e muito, o planejamento. Escrito por 15 autores diferentes com larga vivência na região, o guia é um companheiro e tanto para o viajante, que se sentirá mais seguro, informado e, sobretudo, ansioso para desvendar os encantos dessa Europa mais longínqua.",
                "https://images-na.ssl-images-amazon.com/images/I/41XBcjs7FvL.jpg",
                categoryRepository.getById(20)));

        bookRepository.save(new Book(
                "Turismo: Princípios, Práticas e Filosofia",
                60.00,
                "O mais importante texto introdutório sobre o assunto, ampliado e atualizado, aborda a área de turismo e viagem do ponto de vista global, oferecendo insights sobre as forças econômicas, políticas e sociais que agem sobre o turismo.",
                "https://images-na.ssl-images-amazon.com/images/I/81YeV5d8GHL.jpg",
                categoryRepository.getById(20)));

        bookRepository.save(new Book(
                "Descubra a Europa",
                64.90,
                "O guia Lonely Planet Descubra a Europa é o seu passaporte para as melhores atrações, com dicas atualizadas de especialistas e tudo o que há de imperdível no Velho Mundo, além de locais pouco conhecidos que que esperam por você nos mais incríveis países da Europa. Passeie pelos corredores de Versalhes, admire os afrescos da Capela Sistina, saboreie um autêntico champanhe na região francesa de Champagne (onde mais?), tome uma cerveja em Munique e experimente chocolates em Bruxelas; vá a todos os pontos turísticos mais icônicos do continente, como a Torre Eiffel, em Paris, ou o Coliseu, em Roma, e conheça outros destinos maravilhosos, como a britânica Bath e a austríaca Salzburg. Volte no tempo enquanto navega pelos canais de Veneza ou de Amsterdã, encante-se com a herança medieval de Praga e com a magnífica Alhambra, na cidade espanhola de Granada, e os castelos à beira do rio Reno e do Danúbio. Sem falar, é claro, da grandiosa Acrópole de Atenas. Baladeiros de plantão saberão onde desembarcar: em Londres, capital da vida noturna, ou, quem sabe, na Old Town de Edimburgo, onde não faltam pubs. Já os esportistas vão correr para as estações de esqui de Chamonix, na França, ou de Zermatt, na Suíça – e também às águas cristalinas das Ilhas Gregas e da costa italiana. Tudo isso com seu fiel companheiro de viagem! Para ajudá-lo a fazer boas escolhas e fugir das ciladas turísticas, Descubra a Europa lista sugestões de hotéis, bares, restaurantes e até dos meios de transportes mais adequados para cada situação. Mapas coloridos mostram direitinho onde fica cada lugar. Descubra o melhor da Europa e comece sua aventura agora mesmo!",
                "https://images-na.ssl-images-amazon.com/images/I/912i08aXZxL.jpg",
                categoryRepository.getById(20)));

        bookRepository.save(new Book(
                "World Travel: An Irreverent Guide",
                107.95,
                "Anthony Bourdain saw more of the world than nearly anyone. His travels took him from the hidden pockets of his hometown of New York to a tribal longhouse in Borneo, from cosmopolitan Buenos Aires, Paris, and Shanghai to Tanzania's utter beauty and the stunning desert solitude of Oman's Empty Quarter--and many places beyond. In World Travel, a life of experience is collected into an entertaining, practical, fun and frank travel guide that gives readers an introduction to some of his favorite places--in his own words. Featuring essential advice on how to get there, what to eat, where to stay and, in some cases, what to avoid, World Travel provides essential context that will help readers further appreciate the reasons why Bourdain found a place enchanting and memorable. Supplementing Bourdain's words are a handful of essays by friends, colleagues, and family that tell even deeper stories about a place, including sardonic accounts of traveling with Bourdain by his brother, Christopher; a guide to Chicago's best cheap eats by legendary music producer Steve Albini, and more. Additionally, each chapter includes illustrations by Wesley Allsbrook. For veteran travelers, armchair enthusiasts, and those in between, World Travel offers a chance to experience the world like Anthony Bourdain.",
                "https://images-na.ssl-images-amazon.com/images/I/91vF8dQLyaS.jpg",
                categoryRepository.getById(20)));

        bookRepository.save(new Book(
                "Coleção 50 Lugares Espetaculares Volume 1: Brasil",
                19.90,
                "Os melhores destinos de viagem para você ver, se encantar e arrumar as malas No primeiro volume da Coleção 50 Lugares Espetaculares: Brasil, você encontrará paisagens fascinantes, lazer e diversão, história e cultura. Confira alguns lugares: - Fernando de Noronha - Jericoacoara - Lençóis Maranhenses - Porto de Galinhas - Olinda - Pipa - Maragogi - Morro de São Paulo - E muito mais!",
                "https://images-na.ssl-images-amazon.com/images/I/61-QyN8oBUS.jpg",
                categoryRepository.getById(20)));

        // - Sociologia (21)
        bookRepository.save(new Book(
                "Sociologia do desconhecimento: Ensaios sobre a incerteza do instante",
                50.38,
                "O estudo sociológico do desconhecimento é relativo ao modo de conhecer-se da sociedade contemporânea, uma sociedade estruturalmente caracterizada por fatores ocultos necessários à sua reprodução como sociedade para a atualidade do capital. É o preço que, sem saber, a sociedade paga pelo modo capitalista de produzir e pelo modo capitalista de viver e de pensar. A sociologia do desconhecimento abordada por José de Souza Martins é a sociologia do conhecimento de Karl Mannheim aplicada à realidade social dominada pela falsa consciência sem a qual a sociedade capitalista não pode se reproduzir.",
                "https://images-na.ssl-images-amazon.com/images/I/41lU+ucGa9L.jpg",
                categoryRepository.getById(21)));

        bookRepository.save(new Book(
                "Sociologia clássica: Marx, Durkheim e Weber",
                36.15,
                "Este livro apresenta o pensamento dos fundadores da sociologia a partir de três eixos básicos: teoria sociológica; teoria da modernidade; teoria política: problemas e desafios da realidade social. Este método, além de permitir uma análise comparativa das teorias de Marx, Durkheim e Weber, possibilita também uma compreensão da sociologia enquanto ciência e uma reflexão sobre a natureza e as perspectivas da vida social em tempos modernos. Retomando a visão destes autores, o leitor é convidado a exercitar sua 'imaginação sociológica', adentrando, assim, no rico debate sociológico sobre as diferentes maneiras, métodos e perspectivas de pesquisa e interpretação da sociedade.",
                "https://images-na.ssl-images-amazon.com/images/I/71lmcSgzMqL.jpg",
                categoryRepository.getById(21)));

        bookRepository.save(new Book(
                "Conceitos essenciais da Sociologia - 2ª ediçao",
                44.90,
                "Este livro, agora lançado em edição revista, é uma espécie de manual contemporâneo da Sociologia, apresentando 67 de seus conceitos essenciais. Com uma linguagem clara e concisa, Anthony Giddens e Philip W. Sutton explicam terminologias e ideias fundamentais dessa disciplina, bem como suas origens e suas aplicações contemporâneas, obtendo, ao final, uma obra que fornece um panorama atualizado dos desenvolvimentos da Sociologia nos últimos 150 anos.",
                "https://images-na.ssl-images-amazon.com/images/I/91XCyC5CCBL.jpg",
                categoryRepository.getById(21)));

        bookRepository.save(new Book(
                "Lições de Sociologia: Física dos Costumes e do Direito",
                37.79,
                "Esta obra póstuma, publicada pela primeira vez em 1950, foi elaborada a partir da reunião de diversos manuscritos inéditos de cursos de sociologia – apresentados sob a forma de conferências – ministrados por Émile Durkheim entre 1890 e 1900 na Universidade de Bordeaux, e repetidos na Sorbonne em 1904 e 1912. Estes estudos revelam o pensamento político de Durkheim, e apresentam o entendimento do autor sobre a física dos costumes e do direito.",
                "https://images-na.ssl-images-amazon.com/images/I/51Galk93AcL.jpg",
                categoryRepository.getById(21)));

        bookRepository.save(new Book(
                "O Suicídio: Estudo de Sociologia",
                49.99,
                "Considerado uma das obras-mestras da Sociologia, este clássico estudo de Durkheim apresenta o suicídio como um fenômeno cujas origens encontram-se fundamentadas na própria sociedade. Sem todavia abandonar a influência exercida pelo fator psicológico, o autor propõe uma ruptura com relação ao entendimento de ser este o princípio primordialmente desencadeador e gerador de influência na produção do ato, e demonstra ser possível estudá-lo e compreendê-lo de maneira mais ampla a partir da compreensão da sociedade em si, de sua estruturação e de todas as determinações previamente impostas ao indivíduo por essa instituição. Dentre os fatores preponderantes para o suicídio, Durkheim analisa detidamente estado civil, opção religiosa e integração social, e o caracteriza em três tipos essenciais: egoísta, altruísta e anômico. Nesta obra, o autor defende veementemente o caráter sociológico inerente ao suicídio, interpretando-o como uma tendência já presente na sociedade, à qual o indivíduo, se distante do seu ponto central de equilíbrio, acaba por sucumbir, trazendo-a à manifestação.",
                "https://images-na.ssl-images-amazon.com/images/I/71PbT8lJvWL.jpg",
                categoryRepository.getById(21)));

        // - Enciclopédias (22)
        bookRepository.save(new Book(
                "Enciclopedia Do Mundo Animal",
                129.00,
                "Enciclopédia ilustrada com muitas das espécies existentes no Reino Animal, acompanhadas de fotografias e fichas explicativas com seu nome comum, científico, área de distribuição e estado de conservação. Mais de 1.500 fotografias ilustram cada espécie, com especial destaque para algumas delas como o tigre, o tubarão-branco e a borboleta-monarca entre outras, sobre as quais são explicadas todas as suas características físicas e comportamentais.",
                "https://images-na.ssl-images-amazon.com/images/I/51yS76rfX0L.jpg",
                categoryRepository.getById(22)));

        bookRepository.save(new Book(
                "O livro do carro: Enciclopédia visual",
                57.08,
                "Amantes da arte automobilística, loucos por motores, aficionados por design, curiosos e saudosistas certamente vão se apaixonar por esta coletânea dos veículos que fizeram história – e quanta história! Em O livro do carro, o leitor pode percorrer a longa e fascinante trajetória da indústria automobilística com incríveis detalhes visuais, além de acompanhar a análise de fatores históricos e econômicos que influenciaram o mercado automobilístico década a década, desde o surgimento do conceito de transporte pessoal criado por Karl Benz em 1885 até os modelos híbridos e menos poluentes do século XXI.",
                "https://images-na.ssl-images-amazon.com/images/I/81f-6SukNEL.jpg",
                categoryRepository.getById(22)));

        bookRepository.save(new Book(
                "Enciclopédia Show do Milhão Especial Maravilhas do Mundo",
                59.90,
                "Especial Maravilhas do Mundo traz aos leitores uma preciosa referência das mais espetaculares construções já feitas pelo ser humano e dos mais incríveis lugares esculpidos pela natureza ao longo de milhões de anos. São locais de rara beleza que vão levá-lo a uma viagem pelo tempo e pelo espaço, com o apoio da História, da Geografia e das Ciências Naturais. Este livro divide-se em três partes: \"Maravilhas no Mundo\", \"Maravilhas no Brasil\" e \"As Sete Maravilhas da Antiguidade\". A lista segue a ordem alfabética. Nas páginas com moldura marrom estão as maravilhas construídas, enquanto as naturais aparecem com moldura azul. Para cumprir essa jornada inesquecível, o livro mostra todos os lugares por meio de imagens fascinantes e textos de fácil leitura. Bom proveito e boa viagem!",
                "https://images-na.ssl-images-amazon.com/images/I/61zba-ZU8AL.jpg",
                categoryRepository.getById(22)));

        bookRepository.save(new Book(
                "Enciclopédia da bruxaria",
                35.69,
                "Este é um livro de Bruxaria escrito por uma bruxa praticante. Trata-se de uma enciclopédia completa a ser usada pelos estudiosos deste assunto tão vasto e fascinante por meio de verbetes explicativos que vão de termos ligados à Bruxaria a uma síntese biográfica a respeito dos grandes nomes do mundo da magia e do ocultismo, como Aleister Crowley, Charles Leland, Gerald Gardner, John Dee e Margaret Murray. A Bruxaria é tão antiga quanto a existência da raça humana e, atualmente, é praticada de forma ativa por pessoas de todas as classes. Para seus seguidores, ela vai além de seus encantos e feitiços, ou até mesmo de suas reuniões secretas e seus rituais, trata-se de uma filosofia e uma forma de vida, a forma de religião mais antiga dentre as que apregoam a magia e a veneração da natureza. A renomada autora, Doreen Valiente, estuda o oculto há mais de trinta anos. Ela foi iniciada em quatro facções diferentes do culto à Bruxaria que estão surgindo na Grã-Bretanha. Desde que o último Ato da Bruxaria foi revogado em 1951, o ressurgimento do interesse público pela Bruxaria tem sido o assunto de inúmeras controvérsias. Este livro tem a intenção de ser uma contribuição séria ao estudo de um assunto que ficou no obscuro por muito tempo devido ao preconceito e ao sensacionalismo.",
                "https://images-na.ssl-images-amazon.com/images/I/A1gyVESwbEL.jpg",
                categoryRepository.getById(22)));

        bookRepository.save(new Book(
                "Básico: Enciclopédia de Receitas do Brasil",
                77.70,
                "'Básico', o novo livro de Ana Trajano, apresenta a cozinha brasileira viva em várias versões. São 512 receitas, resultantes dos dezenove anos de andanças pelo nosso país e de muitas pesquisas da autora sobre a nossa culinária de raiz. Ele começa com um Tira-gosto, capítulo de petiscos que dá boas-vindas ao leitor da mesma maneira que recebemos nossos amigos em casa. Depois vêm os pratos principais, Mistura, seguidos pelos acompanhamentos que ajudam dar Sustância ao prato. Em seguida, as Sobremesas que revela a Fartura da doçaria brasileira e por fim, os Pães e Quitandas que acompanham nosso tradicional cafezinho. O livro revela toda a diversidade gastronômica brasileira com belíssimas fotos de encher os olhos. A obra convida a todos a manter e a resgatar a autoestima de nossa cozinha e incentivar a presença dessa cozinha cada vez mais nos cursos, pesquisas e bibliografias, torcendo para que ingredientes como azeite de dendê, manteiga de garrafa e boas farinhas de mandioca, entre outros, abandonem o rótulo de “regionais” para tornar- se, como o arroz e o feijão, parte de nosso dia a dia.",
                "https://images-na.ssl-images-amazon.com/images/I/61SZOgwcZ1L.jpg",
                categoryRepository.getById(22)));

        // - Economia (23)
        bookRepository.save(new Book(
                "Economia: O que é, para que serve, como funciona",
                53.05,
                "Um livro indispensável para quem deseja entender melhor os desafios do mundo em que vivemos Sem gráficos, equações ou jargões, o renomado economista e professor Charles Wheelan apresenta tudo o que você precisa saber sobre economia e nunca conseguiu compreender. Lançando mão de exemplos cotidianos, Wheelan esclarece as noções e conceitos básicos dessa ciência fascinante. Tudo isso de maneira fácil, prática e muito bem-humorada. Aqui, o leitor entenderá os mecanismos fundamentais e os problemas básicos da economia, tais como: - Por que há inflação?- Que papel governo, bancos centrais e comércio mundial exercem nas economias locais? - Qual o poder dos incentivos públicos?- Por que não foi possível evitar a crise financeira de 2008?- Quais os prós e os contras da globalização? Um livro essencial para estudantes de economia e também para os que simplesmente desejam compreender melhor os desafios do mundo em que vivemos. Com nova capa, este livro é uma reedição de Economia nua e crua.",
                "https://images-na.ssl-images-amazon.com/images/I/81rAXJAhgDS.jpg",
                categoryRepository.getById(23)));

        bookRepository.save(new Book(
                "Fundamentos de economia",
                58.98,
                "Fundamentos de Economia é um livro dirigido a estudantes e profissionais das áreas de Ciências Humanas em geral, que fornece uma visão abrangente das principais questões econômicas de nosso tempo. Trata-se de um livro introdutório de Economia Aplicada, no qual os autores explicam com clareza e concisão conceitos e problemas econômicos fundamentais, de forma que os estudantes possam ter melhor compreensão da realidade econômica. A obra apresenta temas como a evolução da Ciência Econômica, Economia e Direito, Teoria Microeconômica (Demanda, oferta, mercado, produção e custos), Política Macroeconômica, Inflação, Setor Público e Crescimento e desenvolvimento econômico. Com abordagem didática, traz, ainda, exercícios e glossário com os principais verbetes da área.",
                "https://images-na.ssl-images-amazon.com/images/I/81bUci6nSyL.jpg",
                categoryRepository.getById(23)));

        bookRepository.save(new Book(
                "Crash: Uma breve história da economia",
                23.87,
                "Dinheiro é um mecanismo engenhoso: permite que a manicure compre pão sem ter de fazer as unhas do padeiro. Sim, se você prestar atenção, vai ver que notas, moedas e os números que aparecem no saldo da sua conta são entidades abstratas, quase mágicas. Elas são feitas de tempo. Ao receber dinheiro de alguém, você está ganhando partículas do tempo que esse alguém dedicou a outra tarefa, para outra pessoa. Genial. Mas o que o dinheiro tem de brilhante a economia tem de insana. Na Roma Antiga, inventaram um congelamento de preços desastroso – no Brasil também. Na Holanda do século 17, uma bolha especulativa fez com que uma flor valesse o preço de uma casa. Em 2017, meia dúzia de bitcoins compravam um apartamento. Crash faz um passeio por 12 mil anos de civilização e traça paralelos entre o passado e o presente para explicar como funcionam as moedas, a inflação, o câmbio, o indo e vindo infinito de euforia e depressão na economia. E não menos importante: decifra o universo das ações, das criptomoedas, do Tesouro Direto, dos fundos de investimento. Também elucida as estratégias dos grandes investidores e as picaretagens dos aproveitadores. Com este livro, que chega à sua terceira versão, revista e atualizada para a realidade da terceira década do século 21, você vai entender como a história, a psicologia e até a biologia explicam a saga do dinheiro. E saber melhor o que fazer com o seu.",
                "https://images-na.ssl-images-amazon.com/images/I/61r3V8iuZVL.jpg",
                categoryRepository.getById(23)));

        bookRepository.save(new Book(
                "O investidor inteligente",
                38.28,
                "Maior consultor de investimentos do século XX, Benjamin Graham ensinou e inspirou milhares de pessoas ao redor do mundo. Seu conceito de “valor de investimento” protege os investidores de cometer erros substanciais e os ensina a desenvolver estratégias de longo prazo. Isso fez com que O investidor inteligente se tornasse a bíblia do mercado de ações desde sua primeira publicação, em 1949. A partir daí, as evoluções do mercado provaram a sabedoria das estratégias de Graham. Esta edição conta ainda com atualizações e apontamentos do jornalista Jason Zweig, além de prefácios de Warren Buffett e Armínio Fraga.",
                "https://images-na.ssl-images-amazon.com/images/I/71XhGdYgoTL.jpg",
                categoryRepository.getById(23)));

        bookRepository.save(new Book(
                "O jeito Warren Buffett de investir: Os segredos do maior investidor do mundo",
                26.41,
                "Warren Buffett é o mais famoso investidor de todos os tempos e um dos mais admirados gestores da atualidade - além, é claro, de um dos homens mais ricos do mundo. Como ele se tornou tão bem-sucedido com a compra de ações e empresas? E, mais importante, que ensinamentos ele pode oferecer a quem deseja investir na Bolsa?",
                "https://images-na.ssl-images-amazon.com/images/I/81gLXSghkLS.jpg",
                categoryRepository.getById(23)));

        bookRepository.save(new Book(
                "O andar do bêbado: Como o acaso determina nossas vidas",
                31.91,
                "Best-seller nacional e internacional, com cerca de 180 mil exemplares vendidos no Brasil! Esta edição comemorativa celebra os 10 anos de lançamento do best-seller O andar do bêbado, do físico e matemático Leonard Mlodinow. Não estamos preparados para lidar com o aleatório e por isso não percebemos como o acaso interfere em nossas vidas. Nesse livro notável, Mlodinow combina os mais diferentes exemplos para mostrar que as notas escolares, diagnósticos médicos, sucesso de bilheteria e resultados eleitorais são, como muitas outras coisas, determinados por eventos imprevisíveis. Este livro instigante pões em xeque tudo que acreditamos saber sobre como o mundo funciona. E, assim, nos ajuda a fazer escolhas mais acertadas e a conviver melhor com os fatores que não podemos controlar. 'Um guia maravilhoso e acessível sobre como o aleatório afeta nossas vidas' Stephen Hawking 'Mlodinow escreve num estilo leve, intercalando desafios probabilísticos com perfis de cientistas... O resultado é um curso intensivo, de leitura agradável, sobre aleatoriedade e estatística.' George Johnson, New York Times",
                "https://images-na.ssl-images-amazon.com/images/I/81KdmY4M-7L.jpg",
                categoryRepository.getById(23)));

        // - Biologia (24)
        bookRepository.save(new Book(
                "Bio - Volume Único",
                253.71,
                "Livro didático direcionado aos alunos do Ensino Médio e livro de testes(ENEM). ",
                "https://images-na.ssl-images-amazon.com/images/I/51S7ksBGUJL.jpg",
                categoryRepository.getById(24)));

        bookRepository.save(new Book(
                "50 ideias de biologia que você precisa conhecer",
                27.76,
                "Por que as espécies evoluem? Como certas características passam de uma geração para outra? Todos os organismos são feitos de células? O que nos torna humanos? Escrito pelo cientista e jornalista premiado J.V. Chamary, 50 ideias de biologia que você precisa conhecer é o guia definitivo para essas e outras questões essenciais da biologia explicadas em 50 artigos curtos e envolventes que cobrem desde as teorias clássicas até as pesquisas mais recentes. Dos mistérios do sexo e do sono até a seleção natural, a imunidade e a genética, este livro abrirá os seus olhos para os processos vitais que garantem a vida na Terra, incluindo como os genes controlam o crescimento e o comportamento dos seres vivos, como o corpo se desenvolve a partir de uma única célula e como as forças ambientais criam a diversidade de espécies através da evolução. Por meio de conceitos-chave explicados em termos simples e com a ajuda de diagramas e linhas do tempo que mostram as principais descobertas científicas no seu contexto histórico, o mais novo livro da premiada coleção 50 ideias proporciona um panorama completo de um dos assuntos mais fascinantes, que vem assombrando cientistas ao longo dos séculos: o estudo da vida.",
                "https://images-na.ssl-images-amazon.com/images/I/81G9MSD5dqL.jpg",
                categoryRepository.getById(24)));

        bookRepository.save(new Book(
                "Biologia Molecular da Célula",
                340.00,
                "À medida que a quantidade de informações em biologia aumenta exponencialmente, é cada vez mais importante que os livros tenham a capacidade de transformar grandes volumes de conhecimento científico em princípios concisos e conceitos duradouros. Assim como em edições anteriores, Biologia molecular da célula atinge este objetivo com seu texto claro e transparente, aliado a ilustrações de alta qualidade e explicações de abordagens matemáticas necessárias para a análise quantitativa das células, moléculas e sistemas. Esta edição foi revisada e atualizada extensivamente a partir das pesquisas mais recentes, oferecendo uma excelente estrutura para o ensino e o aprendizado da biologia celular.",
                "https://images-na.ssl-images-amazon.com/images/I/81nxCi9heyL.jpg",
                categoryRepository.getById(24)));

        bookRepository.save(new Book(
                "A origem das espécies: A origem das espécies por meio da seleção natural ou a preservação das raças favorecidas na luta pela vida",
                51.84,
                "Ainda considerado como um dos mais inovadores e desafiantes tratados biológicos já escritos, A origem das espécies, com sua abordagem sobre os processos evolutivos, chocou grande parte do mundo ocidental, quando foi lançado em 1859. Nesta nova edição, com ilustrações em cada capítulo e prefácio de Nélio Bizzo, especialista no assunto e professor da Universidade de São Paulo, os leitores terão contato com a mais importante obra sobre Biologia jamais escrita.",
                "https://images-na.ssl-images-amazon.com/images/I/81X706V7XsL.jpg",
                categoryRepository.getById(24)));

        bookRepository.save(new Book(
                "Livro mundo animal - Animais brasileiros",
                16.92,
                "A grande variedade de peixes tropicais; o incrível mundo dos anfíbios, os primeiros animais habitantes do ambiente terrestre; os répteis, seres dominantes durante milhões de anos em um ambiente que impulsionou a evolução e o desenvolvimento das aves. Estas e outras curiosidades estão reunidas neste livro, que traz uma seleção de fotos em excelente qualidade, além de informações sobre as espécies nativas dos biomas do Brasil. Eis uma obra necessária e atual para reforçar seus conhecimentos e incentivá-lo a promover a preservação da biodiversidade.",
                "https://images-na.ssl-images-amazon.com/images/I/51YhcBJ9SRL.jpg",
                categoryRepository.getById(24)));

        // - Astronomia (25)
        bookRepository.save(new Book(
                "Cosmos",
                44.90,
                "Escrito por um dos maiores divulgadores de ciência do século XX, Cosmos retraça 14 bilhões de anos de evolução cósmica, explorando tópicos como a origem da vida, o cérebro humano, hieróglifos egípcios, missões espaciais, a morte do sol, a evolução das galáxias e as forças e indivíduos que ajudaram a moldar a ciência moderna. Numa prosa transparente, Carl Sagan revela os segredos do planeta azul habitado por uma forma de vida que apenas começa a descobrir sua própria identidade e a se aventurar no vasto oceano do espaço sideral. Aqui, o tratamento dos temas científicos está sempre imbricado com outros campos de estudo tradicionais, como história, antropologia, arte e filosofia. Publicado pela primeira vez em 1980, Cosmos reúne alguns dos conhecimentos mais avançados da época sobre a natureza, a vida e o Universo ― e se mantém até hoje como uma das mais importantes obras de divulgação científica da história. Embora diversas descobertas fascinantes tenham ocorrido nos últimos quarenta anos, o tema central deste livro nunca estará desatualizado: nosso fascínio pelo conhecimento e a prática da ciência como atividade cultural.",
                "https://images-na.ssl-images-amazon.com/images/I/71zVhbnKmfL.jpg",
                categoryRepository.getById(25)));

        bookRepository.save(new Book(
                "Buracos Negros: Palestra da BBC Reith Lectures",
                13.90,
                "Em palestras emblemáticas, o lendário físico discorre sobre as complexidades que cercam um dos mais fascinantes mistérios do universo. Em 2016 Stephen Hawking participou da série de palestras BBC Reith Lectures, promovida pela rede de televisão britânica BBC e transmitida pela rádio BBC 4. A cada ano uma figura proeminente em sua área é convidada a discorrer sobre temas relevantes. Naqueles meses de janeiro e fevereiro, Hawking falou sobre um assunto que há décadas ocupa lugar de destaque em suas pesquisas: os buracos negros. Em duas exposições memoráveis, um dos maiores gênios da atualidade argumenta que, se pudéssemos compreender como os buracos negros funcionam e como eles desafiam a natureza do espaço e do tempo, seríamos capazes de desvendar os segredos do universo. Insights de toda uma vida são apresentados com a lucidez e a já conhecida verve cômica de Hawking, acrescidos de notas explicativas que situam o leitor nos trechos mais cruciais. Enquanto a maioria dos especialistas se conforma com o fato de trabalhar com temas praticamente ininteligíveis para o público geral, Stephen Hawking tomou para si o papel de grande paladino da divulgação científica — e nesse pequeno livro, mais uma vez, extrapola todas as expectativas. Stephen Hawking já vendeu mais de 150 mil exemplares pela Intrínseca. O livro conta com introdução e notas de David Shukman, editor de ciências da BBC, e ilustrações úteis e divertidas, que complementam a maneira bem-humorada como Hawking expõe suas ideias. 'Hawking consegue explicar algumas das questões mais complexas da física cósmica com uma combinação perfeita de clareza e sagacidade.' — The Observer",
                "https://images-na.ssl-images-amazon.com/images/I/51-1d08f1dS.jpg",
                categoryRepository.getById(25)));

        bookRepository.save(new Book(
                "Astronomia Para Leigos",
                51.98,
                "Você sabe a diferença de uma vermelha gigante e uma anã branca? De asteroides a buracos negros, esse guia de fácil compreensão te leva em uma grande viagem ao universo, te mostrando como conseguir aproveitar ao máximo sua observação estelar, visitas a planetários e outras ótimas atividades astronômicas. O livro também mostra descobertas recentes e novos sites astronômicos… Descubra como: • Aproveitar o céu do seu quintal • Identificar planetas e estrelas • Explorar nosso sistema solar, a Via Láctea e além • Entender o Big Bang, quasares, antimatéria e mais •Juntar-se à SETI, Pesquisa por Inteligência Extraterrestre Aprenda a: • Nomear estrelas e constelações • Usar as ferramentas para observar o céu • Desmistificar o sistema solar • Definir buracos negros e quasares, e muito mais Neste livro você encontrará: • Explicações de fácil entendimento • Informações fáceis de localizar e passo a passo • Ícones e outros recursos de identificação e memorização • Folha de cola para destacar com informações práticas • Listas dos 10 melhores itens relacionados ao assunto • Um toque de humor e diversão ",
                "https://images-na.ssl-images-amazon.com/images/I/61ZuOhovbJS.jpg",
                categoryRepository.getById(25)));

        bookRepository.save(new Book(
                "Do átomo ao buraco negro: Para descomplicar a astronomia",
                24.90,
                "Criador do Poligonautas, canal de ciência no YouTube, com mais de 700 mil seguidores Depois de inventar a roda, aprender a manipular o fogo, desbravar os sete mares e espalhar sua presença pelo globo terrestre, o ser humano passou a mirar o céu: era o novo oceano a ser explorado. De lá pra cá muita coisa aconteceu e a curiosidade sobre o Universo só aumentou. Para nos ajudar nesta expedição, o autor e divulgador científico Schwarza embarca numa jornada que tem início no caótico universo quântico, passando por objetos que vão de planetas a buracos negros de tamanhos que desafiam a nossa imaginação. Em Do átomo ao buraco negro – para descomplicar a astronomia, entenda como funcionam as estrelas, galáxias, quasares, planetas e mais de 60 objetos astronômicos, em um livro que vai além do que os seus olhos podem ver.",
                "https://images-na.ssl-images-amazon.com/images/I/910Om0O1zCL.jpg",
                categoryRepository.getById(25)));

        bookRepository.save(new Book(
                "A História do Universo para quem tem pressa: Do Big Bang às mais recentes descobertas da astronomia! ",
                21.59,
                "Os grandes mistérios e maravilhas do céu noturno sempre nos fascinaram, intrigaram e divertiram, desde os primeiros passos na Terra. Hoje, continuamos nos esforçando para entender o nosso lugar no cosmos.O século 20 foi palco de importantes e assombrosas descobertas sobre o nosso próprio planeta, o sistema solar, as estrelas e as galáxias. Contudo, ainda buscamos respostas para inúmeras questões – O que é matéria escura? Estamos sozinhos no universo? É possível viajar no tempo? –, e essa busca nos proporciona uma valiosa compreensão da vastidão e das infinitas possibilidades do espaço universal que ainda estamos por descobrir.O universo, considerando-se a sua imensidão, pode ser assustador, mas neste livro de fácil compreensão embarcamos numa viagem incrível através de todas as descobertas astronômicas fundamentais, desde as resultantes de crenças de civilizações antigas até as oriundas de pioneiras e recentes observações das ondas gravitacionais, previstas por Einstein mais de 100 anos atrás. Nunca houve ocasião melhor para começar a entender os mistérios do universo, e este guia essencial do cosmos é o melhor ponto de partida!",
                "https://images-na.ssl-images-amazon.com/images/I/819pAW6nzsL.jpg",
                categoryRepository.getById(25)));

        // - Botânica (26)
        bookRepository.save(new Book(
                "A Magia das Folhas: 365 Plantas e Seus Poderes: 2",
                46.33,
                "Em 'O Poder das Folhas' - volume 1 da Trilogia Folhas Sagradas - você aprendeu a identificar e classificar as plantas por suas características mágicas e também aprendeu a combiná-las para criar suas próprias receitas de poder... Agora chegou a hora de dar um passo adiante! Cada raiz, cada folha, flor ou semente traz em si um universo de energias que podem ser despertadas e utilizadas nos seus rituais, banhos e defumações para que você possa usufruir da magia da natureza e transformar a realidade ao seu redor! Por isso, A Magia das Folhas - o volume dois da trilogia - é o maior dicionário de ervas mágicas do país: um guia detalhado de ingredientes e elementos mágicos que podem ser encontrados facilmente na despensa de casa, no quintal ou nos mercados mais próximos. Um guia de estudos e referências, repleto de informações fundamentais e importantíssimas, criado especialmente para o seu dia-a-dia. São 365 plantas classificadas por seus poderes mágicos e seus Orixás regentes, organizadas em 5 eixos temáticos: limpeza, defesa e descarrego espiritual; abertura de caminhos; prosperidade; harmonização; e amor e atração.",
                "https://images-na.ssl-images-amazon.com/images/I/91rEONlp8mL.jpg",
                categoryRepository.getById(26)));

        bookRepository.save(new Book(
                "Herbologia Mágica: a Cura Pela Natureza com Base na Fitoterapia e na Botânica Oculta",
                72.43,
                "Num momento em que a indústria farmacêutica se volta para dedicar-se cada vez mais a produtos químicos sintéticos na produção de remédios, Tânia Gori toma uma via oposta. Sua obra é caleidoscópica. Tem como foco o mundo natural, de onde recolhe ervas e toda a gama de produtos originários da flora. O caleidoscópio está no modo como se organiza o livro: há uma parte introdutória com indicações precisas para a colheita, preparo, conservação de ervas, em conformidade com o fim a que elas se destinam. As plantas, apresentadas em ordem alfabética, prestam-se a muitas finalidades. Os verbetes se iniciam com uma referência à origem do vegetal, seu histórico e um conjunto de informações presente em todos eles: nome popular, científico, e função terapêutica, complementados pelas referências a planeta regente, elemento e deidades. A partir daí, seguem-se diversas aplicações propiciadas pela erva: remédios, banhos, perfumes, sortilégios, talismãs. De muitas delas se destacam as propriedades aromáticas; de outras, as possibilidades gastronômicas, com receitas para produzir os mais diferentes pratos. Os afinados com o esoterismo terão ali muitas informações interessantes e surpreendentes. O estilo leve torna a leitura agradável e atende plenamente o interessa do leitor que procura por informações com mais de 150 ervas.",
                "https://images-na.ssl-images-amazon.com/images/I/71ggLNo6h5L.jpg",
                categoryRepository.getById(26)));

        bookRepository.save(new Book(
                "Introdução a Botânica",
                45.00,
                "Este livro tem por objetivo o estudo dos termos utilizados para as partes das plantas, suas variações, origens e relações com o meio ambiente, além de aspectos ligados à evolução dos vegetais. Destina-se a estudantes de nível superior, estudantes de nível médio e botânicos amadores e autodidatas. O livro está dividido em sete partes - A organização geral de uma Angiosperma; Raiz, Caule, Folha, Flor, Inflorescência e Fruto, cada uma delas ricamente ilustrada, totalizando mais de 400 fotografias coloridas de órgãos vegetais, principalmente de espécies de uso popular. Assim, o leitor pode facilmente confrontar as informações com as plantas utilizadas no seu dia a dia. Mesclamos informações técnicas com aspectos práticos, buscando esclarecer pontos que normalmente são levantados pelos estudantes.",
                "https://images-na.ssl-images-amazon.com/images/I/61G33+6G8fL.jpg",
                categoryRepository.getById(26)));

        bookRepository.save(new Book(
                "Árvores Brasileiras. Manual de Identificação e Cultivo de Plantas Arbóreas Nativas do Brasil - Volume 2",
                130.00,
                "Trata-se de um livro luxuoso no formato 21 x 31 cm, com 384 páginas, apresenta uma planta por página contend, fotografias coloridas da árvore adulta, detalhe de um ramo florífero, fruto, semente, tronco e madeira, de 352 espécies de árvores existentes no país (principalmente as raras e ameaçadas de extinção).Contém ainda informações escritas sobre as características de cada planta, sua fenologia, ocorrência, obtenção de sementes e mudas, etc. Totalmente impresso em papel couchê liso importado de 115g e encadernado em capa dura. De autoria do Eng. Agr. Harri Lorenzi.",
                "https://images-na.ssl-images-amazon.com/images/I/819ff46SkiL.jpg",
                categoryRepository.getById(26)));

        bookRepository.save(new Book(
                "A vida secreta das árvores",
                17.30,
                "E se tudo o que você sempre pensou saber a respeito das árvores estivesse errado? E se, apesar de tão diferentes de nós, descobríssemos que elas compartilham diversas características dos humanos? Nos últimos anos a ciência tem comprovado que as árvores e o homem têm muito mais em comum do que poderíamos imaginar. Assim como nós, elas se comunicam, mantêm relacionamentos, formam famílias, cuidam dos doentes e dos filhos, têm memória, defendem-se de agressores e competem ferozmente com outras espécies – às vezes, até com outras árvores da mesma espécie. Algumas são naturalmente solitárias, enquanto outras só conseguem viver plenamente se fizerem parte de uma comunidade. E, assim como nós, cada uma se adapta melhor a determinado ambiente. Em A vida secreta das árvores, o engenheiro florestal alemão Peter Wohlleben alia seus 20 anos de experiência às últimas descobertas científicas para examinar o dia a dia desses seres fantásticos. Com um ponto de vista surpreendente e inovador, o livro se tornou um fenômeno na Alemanha, entrou para a lista de mais vendidos do The New York Times e teve seus direitos negociados para 18 países. Essa viagem fascinante pela vida das árvores e florestas é um convite a repensarmos nossa relação com a natureza.",
                "https://images-na.ssl-images-amazon.com/images/I/61b-nr12xQL.jpg",
                categoryRepository.getById(26)));

        // - Arqueologia (27)
        bookRepository.save(new Book(
                "A arqueologia passo a passo",
                25.53,
                "De um modo ou de outro, tudo o que brota da terra retorna a ela um dia. No solo ou na água, em climas frios ou secos, a terra encerra e protege as ruínas e os objetos esquecidos pelo homem, resquícios de civilizações antigas. Os arqueólogos estudam esses vestígios, revelando aspectos importantes sobre a vida dos homens de antigamente e sobre as mudanças climáticas que modificaram o planeta. Atualmente, os arqueólogos estão por toda parte, em montes e vales, sob os mares e nas cidades. Eles investigam todos os períodos da humanidade, das nossas origens até os dias de hoje, e examinam as culturas antigas, tanto as desaparecidas quanto as antepassadas diretas das sociedades atuais. Ao acompanhar o seu trabalho passo a passo, neste guia sobre a arqueologia, aprendemos não só a respeito dos vários ramos dessa ciência e os diversos métodos utilizados pelos arqueólogos para encontrar e estudar ruínas e sítios arqueológicos, mas também sobre a história do nosso planeta e de todos que o ocuparam. Muitos desses vestígios vêm sendo apagados pela ação do próprio ser humano, seja no reaproveitamento de materiais, seja em projetos de utilização do território - como a edificação de uma grande barragem que inundará um vale inteiro, de um estacionamento subterrâneo ou de uma linha de metrô. Ao falar sobre a arqueologia preventiva, este livro chama atenção dos jovens para alguns cuidados a serem tomados nos dias de hoje, e nos ensina que a incerteza quanto ao futuro pode ser atenuada por um conhecimento mais amplo do passado.",
                "https://images-na.ssl-images-amazon.com/images/I/91W8rf1CF6S.jpg",
                categoryRepository.getById(27)));

        bookRepository.save(new Book(
                "Uma breve história da arqueologia",
                27.94,
                "'A extraordinária história da aventura arqueológica Faraós dourados e civilizações perdidas, crânios de neandertais e arte rupestre em cavernas da Era do Gelo – a arqueologia nos possibilita o contato com tudo isso e muito mais. Como ciência surgiu relativamente há pouco tempo – no século XVIII, usando métodos como coleta e escavação para acessar culturas e costumes de povos antigos que habitaram o planeta antes de nós. Verdadeira área de estudos multidisciplinar, tem interfaces com a política, a geologia, a biologia, a botânica... E é a única ciência a abranger toda a história humana: mais de três milhões de anos. Brian Fagan, especialista internacional em pré-história, revisita aqui as aventuras e os feitos de alguns dos maiores arqueólogos, incluindo palácios da Grécia antiga, ruínas maias, a Pedra de Roseta, o misterioso círculo de Stonehenge e Pompeia, a cidade enterrada por cinza vulcânica no ano 79. Vemos como, graças a homens e mulheres curiosos e persistentes, a compreensão sobre o passado humano foi se tornando mais rica, com o conhecimento científico e a pesquisa criteriosa derrotando a ignorância e o preconceito.'",
                "https://images-na.ssl-images-amazon.com/images/I/81++2thdyUL.jpg",
                categoryRepository.getById(27)));

        bookRepository.save(new Book(
                "O grande livro dos mistérios antigos",
                63.35,
                "Durante séculos, filósofos, cientistas e charlatões tentaram decifrar os mistérios desconcertantes do nosso passado, de Stonehenge ao continente perdido da Atlântida. Hoje, no entanto, testes de DNA, datação por radiocarbono e outras ferramentas de investigação de ponta, juntamente com uma dose saudável de bom senso, estão nos guiando para mais perto da verdade. Agora, o historiador Peter James e o arqueólogo Nick Thorpe abordam esses enigmas antigos, apresentando as informações mais recentes da comunidade científica e os desafios mais surpreendentes para explicações tradicionais de mistérios, como: • A ascensão e a queda dos maias; • A maldição de Tutancâmon; • A devastação de Sodoma e Gomorra; • As linhas de Nazca e o mapa de Vinland; • A existência de Robin Hood. Essas verdadeiras histórias de mistério se distorcem e se transformam em uma boa história policial, enquanto James e Thorpe apresentam as evidências a favor e contra as teorias especializadas, lançando nova luz sobre a antiga luta da humanidade para dar sentido ao passado. O Grande Livro dos Mistérios Antigos vai entreter e iluminar, encantar os curiosos e informar os mais sérios.",
                "https://images-na.ssl-images-amazon.com/images/I/91hNEdsd+1L.jpg",
                categoryRepository.getById(27)));

        bookRepository.save(new Book(
                "Arqueologia",
                31.49,
                "O estrondoso sucesso dos filmes de Indiana Jones ajudou a consolidar a ideia do arqueólogo como um romântico aventureiro. Este livro mostra que, descontada a magia típica do cinema, tal imagem popular tem mesmo um fundo de verdade. Mais do que simplesmente \"cavar buracos\" para descobrir objetos antigos, a Arqueologia é uma ciência com métodos próprios que desenvolve sobretudo a capacidade de \"ler\" o que nos dizem os vestígios encontrados. O autor revela em linguagem acessível como agem e pensam os arqueólogos e quais os caminhos para quem quer se tornar arqueólogo no Brasil. Demonstra que essa é uma profissão que exige certo esforço físico e disponibilidade diante dos desafios do desconhecido - dois ingredientes indispensáveis, afinal, a toda grande aventura.",
                "https://images-na.ssl-images-amazon.com/images/I/71YXUKJYv-L.jpg",
                categoryRepository.getById(27)));

        bookRepository.save(new Book(
                "Forbidden Archeology: The Full Unabridged Edition",
                197.11,
                "Over the centuries, researchers have found bones and artifacts proving that humans like us have existed for millions of years. Mainstream science, however, has supppressed these facts. Prejudices based on current scientific theory act as a knowledge filter, giving us a picture of prehistory that is largely incorrect.",
                "https://images-na.ssl-images-amazon.com/images/I/818zkOJF6eL.jpg",
                categoryRepository.getById(27)));

        // - Culinária (28)
        bookRepository.save(new Book(
                "Divina alquimia: Receitas veganas",
                89.47,
                "Desde que descobriu o poder da culinária natural em sua vida, Patricia Helú se dedica à criação de receitas, adaptando o tradicional em opções nutritivas e saborosas. Sua maior paixão é compartilhá-las para inspirar e empoderar as pessoas na cozinha. Com preparos à base do mundo vegetal, a autora apresenta receitas criativas e acessíveis a todos os níveis de intimidade com a cozinha. Dividido por ocasiões, que vão de um almoço na praia a um banquete árabe, Divina alquimia promete trazer novas misturas e inúmeras possibilidades para uma cozinha diária mais leve e deliciosa.",
                "https://images-na.ssl-images-amazon.com/images/I/81aQobTh7BS.jpg",
                categoryRepository.getById(28)));

        bookRepository.save(new Book(
                "Le Cordon Bleu : Todas as técnicas culinárias",
                129.99,
                "Este livro é a 'bíblia' da escola de culinária mais prestigiada do mundo. Com mais de 800 segredos de preparação e técnicas de cozinha, ilustrados passo a passo, inclui também dicas, sugestões e receitas dos tops chefs da escola. - Um guia completo e ilustrado de ingredientes e técnicas, desde as mais simples até as mais avançadas. - Ensina dicas, sugestões, artimanhas e truques de experts para conseguir o melhor resultado sempre. - Com mais de 2000 fotografias e ilustrações especiais. - Com receitas que vão da cozinha clássica francesa e italiana às tradições culinárias do Oriente. - Garante o sucesso de todas as receitas, das mais simples às mais complexas e sofisticadas. - Um clássico da cozinha de todas as épocas.",
                "https://images-na.ssl-images-amazon.com/images/I/51rf+kqLPZL.jpg",
                categoryRepository.getById(28)));

        bookRepository.save(new Book(
                "Cozinha prática",
                58.24,
                "Neste novo livro, Rita Lobo apresenta 60 receitas e todas as dicas, técnicas culinárias e truques de economia doméstica da temporada de básicos do programa Cozinha Prática, do GNT. Um curso de culinária em 13 capítulos muito bem explicados e ilustrados. Conhece alguém que ainda foge do fogão? Essa pessoa é você? Este livro pode mudar a sua vida.",
                "https://images-na.ssl-images-amazon.com/images/I/91AptHZ+ELL.jpg",
                categoryRepository.getById(28)));

        bookRepository.save(new Book(
                "Pão nosso: receitas caseiras com fermento natural",
                70.28,
                "Imagine assar em casa um pão melhor que o da padaria. É isso que você vai aprender em Pão nosso. Além de ensinar os segredos do levain, o fermento natural, Luiz Américo Camargo ainda propõe receitas caseiras que passaram pelo seu rigor de crítico de gastronomia. São dezenas de pães: integral, de nozes, de azeitona, de mandioca, baguete, até panetone tem. E você também vai encontrar refeições inteiras em torno das fornadas. Da irresistível salada panzanella, passando pela surpreendente rabanada salgada até um ragu de linguiça que é de limpar o prato ― com pão, naturalmente.",
                "https://images-na.ssl-images-amazon.com/images/I/91vr79mVf+L.jpg",
                categoryRepository.getById(28)));

        bookRepository.save(new Book(
                "Só para um: alimentação saudável para quem mora sozinho: 3",
                48.10,
                "Mora sozinho e quer comer melhor? Rita Lobo ensina você a vencer os obstáculos da cozinha para um ― sem precisar cozinhar do zero a cada refeição. Além de receitas saborosas e muitas técnicas culinárias, este livro traz soluções incríveis para a sua rotina: tem receita em uma panela só, tem uma aula completa de pê-efe, tem dicas desde a lista de compras até a hora de lavar a louça. Sem nem perceber, você vai ficar craque em planejamento. Vai aprender a armazenar, congelar e aproveitar melhor (e reaproveitar!) os alimentos. Vai saber montar uma despensa básica e escolher os utensílios. E ainda vai se divertir na cozinha. Só para um é uma ferramenta fundamental para você manter uma alimentação sempre saudável.",
                "https://images-na.ssl-images-amazon.com/images/I/91H6GA+2CmL.jpg",
                categoryRepository.getById(28)));

        // - Astrologia (29)
        bookRepository.save(new Book(
                "Astrologia sem Segredos: Um Guia Para Você Aprender Astrologia de Modo Fácil e Eficiente",
                34.50,
                "Repleto de ilustrações e exemplos, Astrologia sem Segredos mostra como você pode usar a astrologia de forma prática para melhorar a sua própria vida e a das outras pessoas. Este curso idealizado por uma das principais astrólogas do mundo vai lhe ensinar desde os princípios básicos até a interpretação de um mapa inteiro. Com este livro, você vai descobrir como a astrologia funciona, quando usá-la e como adquirir conhecimentos avançados dessa arte.",
                "https://images-na.ssl-images-amazon.com/images/I/81S1qCT0YvL.jpg",
                categoryRepository.getById(29)));

        bookRepository.save(new Book(
                "Manual de Astrologia Horaria - Edicao Revista",
                190.52,
                "Astrologia horária é o ramo da astrologia que encontra respostas claras e precisas para perguntas específicas. Rápida e simples, a horária foi, durante séculos, o item mais valioso da caixa de ferramentas do astrólogo. Seja a pergunta sobre amor, carreira, doença (ou sobre a previsão do tempo para um churrasco), este guia claro e abrangente feito por um mestre moderno da horária vai mostrar a você como respondê-la. A primeira edição deste livro ganhou rapidamente o status de clássico do ensino em astrologia. Com esta nova versão, esse grande mestre da arte compartilha o que passou a compreender melhor, oferecendo o que aprendeu nestes anos de ensino e prática, clarificando, expandindo e corrigindo o texto original. Com a inteligência e a lucidez que caracterizam sua escrita, o autor guia a todos, de iniciantes a praticantes experimentados, até o coração da astrologia horária. A capacidade de frawley como astrólogo horário é impressionante - the mountain astrologer.",
                "https://images-na.ssl-images-amazon.com/images/I/616WIpvTCTL.jpg",
                categoryRepository.getById(29)));

        bookRepository.save(new Book(
                "Os Signos do Zodíaco: Um Guia Prático para Entender a Astrologia Contemporânea",
                31.10,
                "Em Os Signos do Zodíaco, a astróloga e coach Carolyne Faulkner revela como a antiga sabedoria dos astros pode nos ajudar a aproveitar a vida ao máximo. Seu método, denominado “Astrologia Dinâmica”, consiste em descobrir as boas e más qualidades associadas ao nosso mapa astral e em usar esse conhecimento para fundamentar nossas decisões e relacionamentos. Fácil de aplicar, este manual de astrologia prática ajuda a melhorar nossa saúde emocional, espiritual e física e a aumentar o bem-estar geral.",
                "https://images-na.ssl-images-amazon.com/images/I/81id8t8YYFL.jpg",
                categoryRepository.getById(29)));

        bookRepository.save(new Book(
                "Astrologia dos Relacionamentos Íntimos: Fatores Energéticos do Amor, Sexo e Compatibilidade",
                36.68,
                "Com uma linguagem clara e articulada, Arroyo descreve a interação dinâmica entre duas pessoas do ponto de vista energético, mostrando como elas \"alimentam\" ou estimulam uma à outra ou como se esgotam ou se bloqueiam mutuamente. Ele também elucida um tipo acessível e prático de \"psicologia cósmica\", que focaliza a experiência interior da pessoa, e identifica suas flutuações de energia nos altos e baixos da vida, tanto no nível individual como nos relacionamentos. Neste livro, Arroyo enfatiza a experiência real das pessoas, citando vários clientes, respostas a questionários e centenas de entrevistas, mostrando na prática o que os livros abstratos e teóricos sobre astrologia meramente sugerem. E procura focalizar princípios energéticos que a maioria das pessoas pode identificar em seus relacionamentos e aplicar na própria vida.",
                "https://images-na.ssl-images-amazon.com/images/I/716Grww1shL.jpg",
                categoryRepository.getById(29)));

        bookRepository.save(new Book(
                "Normas Práticas Para a Interpretação do Mapa Astral: Uma Obra De Referência Para Pensar Astrologicamente",
                22.45,
                "Stephen Arroyo, considerado por especialistas como o maior astrólogo do século XX, continua a nos brindar com obras que nos ajudam no difícil processo do autoconhecimento, em que a astrologia se torna uma importante ferramenta para a ampliação dos nossos horizontes emocionais, psicológicos e espirituais. Atendendo aos pedidos de seus inúmeros leitores e alunos de diversas partes do mundo, que ansiavam por um manual de fácil compreensão e que, ao mesmo tempo, reunisse os significados e fatores mais básicos da astrologia numa soberba obra de referência, o autor nos traz neste livro uma obra que não apenas facilita a localização de conceitos fundamentais e detalhes para a interpretação de mapas, mas também serve de guia para ajudar as pessoas a pensar astrologicamente.",
                "https://images-na.ssl-images-amazon.com/images/I/71JJTkvF6XL.jpg",
                categoryRepository.getById(29)));

    }



}
