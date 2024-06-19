-- SQLBook: Code

CREATE DATABASE pi;
USE pi;

CREATE TABLE pergunta(
	idPergunta INT NOT NULL AUTO_INCREMENT,
	pergunta VARCHAR(225) NOT NULL,
	PRIMARY KEY (idPergunta)
  );

CREATE TABLE professor (
	idUsuario INT NOT NULL AUTO_INCREMENT,
	login VARCHAR(255) NOT NULL,
	senha VARCHAR(255) NOT NULL,
	PRIMARY KEY (idUsuario)
  );

CREATE TABLE dificuldade(
    idDificuldade INT NOT NULL AUTO_INCREMENT,
    dificuldade VARCHAR(255) NOT NULL,
    PRIMARY KEY (idDificuldade)
    );

CREATE TABLE ranking(
	idRanking INT NOT NULL AUTO_INCREMENT,
	apelidoAluno VARCHAR(255) NOT NULL,
	idDificuldade int NOT NULL,
	pontuacao DECIMAL(6) NOT NULL,
	tempo TIME NOT NULL,
	PRIMARY KEY (idRanking),
    FOREIGN KEY (idDificuldade) 
    REFERENCES dificuldade(idDificuldade)
  );

CREATE TABLE resposta (
	idResposta INT NOT NULL AUTO_INCREMENT,
	alternativa VARCHAR(255) NOT NULL,
	idPergunta INT NOT NULL,
	correta TINYINT NOT NULL,
	PRIMARY KEY (idResposta),
	FOREIGN KEY (idPergunta)
	REFERENCES pergunta(idPergunta)
    );
    
INSERT INTO dificuldade (dificuldade)
VALUES ('Fácil'),
('Médio'),
('Difícil');
-- PERGUNTAS SOBRE A BOCA
INSERT INTO pergunta (pergunta)
VALUES ('Qual a principal função da saliva na digestão dos alimentos?' ),
('Qual a estrutura responsável pela mastigação dos alimentos?'),
('Qual a importância da língua na percepção do sabor dos alimentos?'),
('Qual doença pode ser causada pela higiene bucal inadequada?'),
('Qual o papel da gengiva na saúde bucal?'),
('Qual a função da amílase salivar na digestão dos alimentos?'),
('Qual estrutura da boca auxilia na mistura do alimento com a saliva?'),
('Qual a importância da higiene bucal para a saúde geral do corpo?'),
('Qual o papel do flúor na prevenção da cárie dentária?'),
('Qual o efeito do consumo excessivo de açúcar na saúde bucal?');

-- RESPOSTAS SOBRE A BOCA

INSERT INTO resposta (alternativa, correta, idPergunta)
VALUES ('Digestão de proteínas', 0, 1),
('Quebra de moléculas de carboidratos', 0, 1),
('Absorção de nutrientes', 0, 1),
('Lubrificação do alimento', 1, 1),
('Neutralização de ácidos', 0, 1),

('Língua', 0, 2),
('Dentes', 1, 2),
('Glândulas salivares', 0, 2),
('Faringe', 0, 2),
('Palato mole', 0, 2),

('Produz saliva que lubrifica o alimento', 0, 3),
('Auxilia na mastigação dos alimentos', 0, 3),
('Regula a temperatura do alimento', 0, 3),
('Contém enzimas digestivas', 0, 3),
('Contém papilas gustativas que detectam os sabores básicos', 1, 3),

('Cárie dentária', 1, 4),
('Gastrite', 0, 4),
('Úlcera péptica', 0, 4),
('Doença celíaca', 0, 4),
('Refluxo gastroesofágico', 0, 4),

('Protege os dentes e o osso alveolar', 1, 5),
('Produz saliva que lubrifica o alimento', 0, 5),
('Contém papilas gustativas que detectam os sabores básicos', 0, 5),
('Auxilia na mastigação dos alimentos', 0, 5),
('Regula a temperatura do alimento', 0, 5),

('Digestão de proteínas', 0, 6),
('Lubrificação do alimento', 0, 6),
('Neutralização de ácidos', 0, 6),
('Absorção de nutrientes', 0, 6),
('Quebra moléculas de amido em maltose e dextrina', 1, 6),


('Dentes', 0, 7),
('Glândulas salivares', 0, 7),
('Língua', 1, 7),
('Faringe', 0, 7),
('Palato mole', 0, 7),

('Auxilia na digestão dos alimentos', 0, 8),
('Previne doenças como cáries, gengivite e periodontite', 1, 8),
('Regula a temperatura do corpo', 0, 8),
('Fortalece os ossos', 0, 8),
('Melhora o desempenho físico', 0, 8),

('Neutraliza ácidos na boca', 0, 9),
('Auxilia na digestão dos alimentos', 0, 9),
('Elimina bactérias da boca', 0, 9),
('Fortalece o esmalte dentário e previne a desmineralização', 1, 9),
('Previne doenças gengivais', 0, 9),

('Diminui a produção de saliva', 0, 10),
('Causa mau hálito', 0, 10),
('Dificulta a mastigação dos alimentos', 0, 10),
('Provoca dor de garganta', 0, 10),
('Aumenta o risco de cáries dentárias', 1, 10);

-- PERGUNTAS SOBRE O ESOFAGO

INSERT INTO pergunta (pergunta)
VALUES ('Qual a principal função do esôfago no sistema digestivo humano?'),
('Qual a característica do esôfago que permite o transporte do alimento sem retroceder?'),
('Qual doença pode afetar o esôfago e causar dificuldade para engolir?'),
('Qual o papel do esfíncter esofágico inferior na prevenção do refluxo ácido?'),
('Qual a importância da mucosa esofágica para a proteção do órgão contra o ácido gástrico?'),
('Qual a função principal do esfíncter esofágico superior?'),
('Como o esôfago se protege da ação ácida do suco gástrico?'),
('Qual a diferença entre o esôfago torácico e o esôfago abdominal?'),
('Quais são os principais sintomas de doenças esofágicas?'),
('Qual a importância da motilidade esofágica para a digestão?');

-- RESPOSTAS SOBRE O ESOFAGO

INSERT INTO resposta (alternativa, correta, idPergunta)
VALUES ('Transportar o alimento da boca ao estômago', 1, 11),
('Armazenar o alimento para digestão posterior', 0, 11),
('Absorver nutrientes do alimento', 0, 11),
('Eliminar resíduos do corpo', 0, 11),
('Controlar a temperatura corporal', 0, 11),

('Presença de válvulas cardíacas', 0, 12),
('Contrações musculares peristálticas', 1, 12),
('Camada mucosa espessa', 0, 12),
('Presença de enzimas digestivas', 0, 12),
('Grande capacidade de armazenamento', 0, 12),

('Gastrite', 0, 13),
('Úlcera péptica', 0, 13),
('Doença celíaca', 0, 13),
('Doença de Crohn', 0, 13),
('Refluxo gastroesofágico', 1, 13),


('Relaxa durante a deglutição para permitir a passagem do alimento', 0, 14),
('Contrai-se durante a digestão para evitar o retorno do ácido gástrico', 1, 14),
('Produz muco que lubrifica o esôfago', 0, 14),
('Contém enzimas digestivas que quebram os alimentos', 0, 14),
('Regula a temperatura do alimento no estômago', 0, 14),

('Contém enzimas digestivas que quebram os alimentos', 0, 15),
('Regula a temperatura do alimento', 0, 15),
('Absorve nutrientes do alimento', 0, 15),
('Produz células que secretam muco protetor', 1, 15),
('Contém válvulas cardíacas que impedem o refluxo', 0, 15),

('Permitir a entrada de alimento no esôfago durante a deglutição', 1, 16),
('Fechar a entrada do esôfago durante a respiração para evitar aspiração', 0, 16),
('Controlar o pH do esôfago', 0, 16),
('Regular a temperatura do alimento no esôfago', 0, 16),
('Prevenir o refluxo ácido', 0, 16),

('Produção de muco', 1, 17),
('Camada mucosa espessa', 0, 17),
('Esfíncter esofágico inferior', 0, 17),
('Contrações peristálticas', 0, 17),
('Neutralização do ácido pelo bicarbonato de sódio', 0, 17),

('Localização', 1, 18),
('Função', 0, 18),
('Comprimento', 0, 18),
('Camadas', 0, 18),
('Inervação', 0, 18),

('Dificuldade para engolir', 1, 19),
('Azia', 1, 19),
('Dor no peito', 1, 19),
('Regurgitação ácida', 1, 19),
('Perda de peso inexplicável', 0, 19),

('Transportar o alimento do esôfago para o estômago', 0, 20),
('Misturar o alimento com o suco gástrico', 0, 20),
('Quebrar os alimentos em moléculas menores', 0, 20),
('Absorver nutrientes do alimento', 0, 20),
('Armazenar o alimento para digestão posterior', 0, 20);

-- PERGUNTAS SOBRE O ESTOMAGO

INSERT INTO pergunta (pergunta)
VALUES ('Qual a principal função do estômago no sistema digestivo humano?'),
('Qual a característica do estômago que permite armazenar e misturar grandes volumes de alimento?'),
('Qual a importância do suco gástrico para a digestão no estômago?'),
('Como o estômago se protege da ação ácida do suco gástrico?'),
('Quais são os principais hormônios que regulam a motilidade gástrica?'),
('Qual o papel do piloro no estômago?'),
('Como o estômago regula a quantidade de alimento que recebe?'),
('Quais são os principais movimentos do estômago para misturar e digerir o alimento?'),
('Qual a diferença entre o suco gástrico e o muco gástrico?'),
('Quais são as principais doenças que podem afetar o estômago?');


-- RESPOSTAS SOBRE O ESTOMAGO

INSERT INTO resposta (alternativa, correta, idPergunta)
VALUES ('Armazenar, misturar e digerir o alimento', 1, 21),
('Absorver nutrientes do alimento', 0, 21),
('Eliminar resíduos do corpo', 0, 21),
('Controlar a temperatura corporal', 0, 21),
('Produzir células sanguíneas', 0, 21),

('Parede muscular espessa e elástica', 1, 22),
('Camada mucosa espessa', 0, 22),
('Presença de válvulas cardíacas', 0, 22),
('Grande capacidade de armazenamento', 1, 22),
('Camada mucosa com células que produzem muco', 0, 22),

('Quebrar os alimentos em moléculas menores', 1, 23),
('Neutralizar o pH do estômago', 1, 23),
('Absorver nutrientes do alimento', 0, 23),
('Eliminar resíduos do corpo', 0, 23),
('Controlar a motilidade gástrica', 0, 23),

('Camada mucosa espessa que produz muco protetor', 1, 24),
('Camada muscular espessa que se contrai para misturar o alimento', 0, 24),
('Presença de válvulas cardíacas que impedem o refluxo', 0, 24),
('Camada mucosa com células que produzem ácido gástrico', 1, 24),
('Neutralização do ácido pelo bicarbonato de sódio', 0, 24),

('Grelina', 1, 25),
('Colecistoquinina (CCK)', 1, 25),
('Motilina', 1, 25),
('Secretina', 1, 25),
('Adrenalina', 0, 25),

('Controlar a saída do alimento do estômago para o intestino delgado', 1, 26),
('Armazenar o alimento', 0, 26),
('Misturar o alimento com o suco gástrico', 0, 26),
('Quebrar os alimentos em moléculas menores', 0, 26),
('Neutralizar o pH do estômago', 0, 26),

('Feedback hormonal e nervoso', 1, 27),
('Contrações musculares do estômago', 0, 27),
('Presença de válvulas cardíacas', 0, 27),
('Camada mucosa espessa', 0, 27),
('Tamanho do estômago', 0, 27),

('Ondas peristálticas', 1, 28),
('Movimentos de mistura', 1, 28),
('Contrações segmentares', 1, 28),
('Movimentos propulsivos', 1, 28),
('Todas as opções acima', 1, 28),

('Quebra proteínas em aminoácidos', 1, 29),
('Neutraliza o pH do estômago', 1, 29),
('Lubrifica e protege a mucosa gástrica', 0, 29),
('Atua como barreira contra o ácido gástrico', 0, 29),
('Todas as opções acima', 0, 29),

('Úlcera péptica', 1, 30),
('Gastrite', 1, 30),
('Câncer de estômago', 1, 30),
('Doença celíaca', 0, 30),
('Doença de Crohn', 0, 30);


-- PERGUNTAS SOBRE O INTESTINO DELGADO

INSERT INTO pergunta (pergunta)
VALUES ('Qual a principal função do intestino delgado no sistema digestivo humano?'),
('Em quais partes o intestino delgado é dividido?'),
('Como o intestino delgado absorve os nutrientes dos alimentos?'),
('Qual a importância da bile e do suco pancreático para a digestão no intestino delgado?'),
('Quais são os principais movimentos do intestino delgado para misturar e mover o quimo?'),
('Qual a diferença entre o duodeno, jejuno e íleo?'),
('Como o intestino delgado se protege da ação da bile e do suco pancreático?'),
('Quais são os principais nutrientes absorvidos pelo intestino delgado?'),
('Como o intestino delgado diferencia nutrientes úteis de substâncias nocivas?'),
('Quais são os principais fatores de risco para o desenvolvimento de doenças do intestino delgado?');


-- RESPOSTAS SOBRE O INTESTINO DELGADO

INSERT INTO resposta (alternativa, correta, idPergunta)
VALUES ('Absorver nutrientes do alimento', 1, 31),
('Armazenar o alimento', 0, 31),
('Eliminar resíduos do corpo', 0, 31),
('Controlar a temperatura corporal', 0, 31),
('Produzir células sanguíneas', 0, 31),

('Duodeno, jejuno e íleo', 1, 32),
('Esôfago, estômago e intestino grosso', 0, 32),
('Fígado, vesícula biliar e pâncreas', 0, 32),
('Boca, faringe e esôfago', 0, 32),
('Todas as opções acima', 0, 32),

('Vilosidades e microvilosidades', 1, 33),
('Contrações musculares', 1, 33),
('Presença de válvulas cardíacas', 0, 33),
('Camada mucosa espessa', 0, 33),
('Enzimas digestivas', 0, 33),

('Emulsificar as gorduras', 1, 34),
('Neutralizar o pH ácido do quimo', 1, 34),
('Quebrar proteínas em aminoácidos', 1, 34),
('Absorver nutrientes do alimento', 0, 34),
('Todas as opções acima', 1, 34),

('Segmentação', 1, 35),
('Mistura', 1, 35),
('Propulsao', 1, 35),
('Todas as opções acima', 1, 35),
('Nenhuma das opções acima', 0, 35),

('Duodeno: recebe o quimo do estômago e bile da vesícula biliar; jejuno: absorve a maioria dos nutrientes; íleo: absorve água e eletrólitos', 1, 36),
('Localização', 0, 36),
('Comprimento', 0, 36),
('Camadas', 0, 36),
('Função', 0, 36),

('Camada mucosa espessa que produz muco', 1, 37),
('Neutralização do ácido pelo bicarbonato de sódio', 0, 37),
('Presença de válvulas cardíacas', 0, 37),
('Contrações musculares que movem o quimo', 0, 37),
('Todas as opções acima', 0, 37),

('Carboidratos, proteínas, gorduras, vitaminas e minerais', 1, 38),
('Água e eletrólitos', 0, 38),
('Gases e resíduos digestivos', 0, 38),
('Todas as opções acima', 0, 38),
('Nenhuma das opções acima', 0, 38),

('Células epiteliais intestinais com microvilosidades', 1, 39),
('Presença de anticorpos no sangue', 0, 39),
('Contrações musculares que movem o quimo', 0, 39),
('Camada mucosa espessa que produz muco', 0, 39),
('Flora intestinal', 0, 39),

('Doença celíaca', 1, 40),
('Doença de Crohn', 1, 40),
('Infecções intestinais', 1, 40),
('Intolerância à lactose', 1, 40),
('Todas as opções acima', 1, 40);


-- PERGUNTAS SOBRE O INTESTINO GROSSO


INSERT INTO pergunta (pergunta)
VALUES ('Qual o papel das vilosidades e microvilosidades no intestino delgado?'),
('Como a digestão de carboidratos, proteínas e gorduras ocorre no intestino delgado?'),
('Qual a importância da flora intestinal para a saúde do intestino delgado?'),
('Como o intestino delgado se comunica com o sistema imunológico?'),
('Quais são os sintomas de doenças do intestino delgado?'),
('Qual o papel da válvula ileocecal no intestino delgado?'),
('Como o intestino delgado regula o fluxo de quimo?'),
('Quais são os principais fatores que podem afetar a absorção de nutrientes no intestino delgado?'),
('Como o intestino delgado se regenera após danos?'),
('Quais são as principais doenças que podem afetar a absorção de nutrientes no intestino delgado?');


-- RESPOSTAS SOBRE O INTESTINO GROSSO


INSERT INTO resposta (alternativa, correta, idPergunta)
VALUES ('Aumentar a superfície de absorção de nutrientes', 1, 41),
('Transportar o quimo pelo intestino delgado', 0, 41),
('Secretar enzimas digestivas', 0, 41),
('Neutralizar o pH ácido do quimo', 0, 41),
('Todas as opções acima', 0, 41),

('Carboidratos: quebrados em monossacarídeos por enzimas como amilase e maltase; proteínas: quebradas em aminoácidos por enzimas como pepsinas e tripsinas; gorduras: quebradas em ácidos graxos e glicerol por enzimas como lipases', 1, 42),
('Carboidratos: absorvidos diretamente para o sangue; proteínas: absorvidas através de aminoácidos; gorduras: absorvidas através de quilomicrons', 1, 42),
('Todas as opções acima', 1, 42),
('Nenhuma das opções acima', 0, 42),
('Aguarda resposta', 0, 42),

('Auxiliar na digestão de alimentos', 0, 43),
('Prevenir o crescimento de bactérias patogênicas', 1, 43),
('Produzir vitaminas e minerais', 0, 43),
('Fortalecer o sistema imunológico', 1, 43),
('Todas as opções acima', 1, 43),

('Células epiteliais intestinais produzem citocinas que sinalizam para células imunológicas', 1, 44),
('Presença de placas de Peyer no intestino delgado', 1, 44),
('Flora intestinal ajuda a regular o sistema imunológico', 1, 44),
('Todas as opções acima', 1, 44),
('Aguarda resposta', 0, 44),

('Diarreia', 1, 45),
('Constipação', 1, 45),
('Dor abdominal', 1, 45),
('Perda de peso inexplicável', 1, 45),
('Todas as opções acima', 1, 45),

('Controlar o fluxo de quimo do íleo para o intestino grosso', 1, 46),
('Prevenir o refluxo do conteúdo intestinal para o intestino delgado', 0, 46),
('Neutralizar o pH ácido do quimo', 0, 46),
('Absorver água e eletrólitos', 0, 46),
('Todas as opções acima', 0, 46),

('Contrações musculares', 1, 47),
('Presença de válvulas cardíacas', 0, 47),
('Feedback hormonal', 1, 47),
('Camada mucosa espessa', 0, 47),
('Todas as opções acima', 1, 47),

('Doenças inflamatórias intestinais', 1, 48),
('Infecções intestinais', 1, 48),
('Deficiências de enzimas digestivas', 1, 48),
('Desnutrição', 1, 48),
('Todas as opções acima', 1, 48),

('Células-tronco intestinais', 1, 49),
('Contrações musculares', 0, 49),
('Presença de válvulas cardíacas', 0, 49),
('Camada mucosa espessa', 1, 49),
('Todas as opções acima', 1, 49),

('Doença celíaca', 1, 50),
('Doença de Crohn', 1, 50),
('Doença de Whipple', 1, 50),
('Intolerância à lactose', 1, 50),
('Todas as opções acima', 1, 50);
