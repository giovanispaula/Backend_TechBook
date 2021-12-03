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
    private IBookRepository bookRepository;

    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public void run(String...args) throws Exception {

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
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(3)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(3)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(3)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(3)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(3)));

        // - Medicina (04)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(4)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(4)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(4)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(4)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(4)));

        // - Literatura Brasileira (05)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(5)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(5)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(5)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(5)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(5)));

        // - Romance (06)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(6)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(6)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(6)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(6)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(6)));

        // - Infantil (07)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(7)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(7)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(7)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(7)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(7)));

        // - Poesia (08)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(8)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(8)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(8)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(8)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(8)));

        // - Suspense (09)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(9)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(9)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(9)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(9)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(9)));

        // - Fantasia (10)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(10)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(10)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(10)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(10)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(10)));

        // - Artes (11)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(11)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(11)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(11)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(11)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(11)));

        // - Filosofia (12)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(12)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(12)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(12)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(12)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(12)));

        // - Idiomas (13)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(13)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(13)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(13)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(13)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(13)));

        // - Cinema (14)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(14)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(14)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(14)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(14)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(14)));

        // - Pedagogia (15)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(15)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(15)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(15)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(15)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(15)));

        // - Saúde (16)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(16)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(16)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(16)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(16)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(16)));

        // - Psicologia (17)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(17)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(17)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(17)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(17)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(17)));

        // - Política (18)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(18)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(18)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(18)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(18)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(18)));

        // - Moda (19)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(19)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(19)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(19)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(19)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(19)));

        // - Turismo (20)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(20)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(20)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(20)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(20)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(20)));

        // - Sociologia (21)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(21)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(21)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(21)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(21)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(21)));

        // - Enciclopédias (22)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(22)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(22)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(22)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(22)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(22)));

        // - Economia (23)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(23)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(23)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(23)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(23)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(23)));

        // - Biologia (24)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(24)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(24)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(24)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(24)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(24)));

        // - Astronomia (25)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(25)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(25)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(25)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(25)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(25)));

        // - Botânica (26)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(26)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(26)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(26)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(26)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(26)));

        // - Arqueologia (27)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(27)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(27)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(27)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(27)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(27)));

        // - Culinária (28)
        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(28)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(28)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(28)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(28)));

        bookRepository.save(new Book(
                "",
                00.00,
                "",
                "",
                categoryRepository.getById(28)));
    }

}