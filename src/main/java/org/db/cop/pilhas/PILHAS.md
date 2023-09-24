## Pilhas

Uma **pilha** é uma estrutura de dados linear que segue o princípio do **LIFO** (Last-In-First-Out), o que significa que o último elemento inserido (empilhado) é o primeiro a ser removido (desempilhado). Em outras palavras, o elemento que está no topo da pilha é o primeiro a ser acessado ou removido.

Características importantes das pilhas incluem:

1. **LIFO (Last-In, First-Out)**: O elemento mais recente inserido em uma pilha é o primeiro a ser removido. Isso significa que a pilha age como uma coleção de itens empilhados uns sobre os outros, e você só pode acessar ou remover o item no topo da pilha.
2. **Operações básicas**: As operações fundamentais em uma pilha são:
    - **Push**: Adicionar um elemento ao topo da pilha.
    - **Pop**: Remover o elemento no topo da pilha.
    - **Top (ou Peek)**: Consultar o elemento no topo da pilha sem removê-lo.
    - **isEmpty**: Verificar se a pilha está vazia.
3. **Limitação de acesso**: Você só pode acessar o elemento mais recente (topo) da pilha. Para acessar ou remover elementos no meio da pilha, você deve primeiro remover todos os elementos acima dele.
4. **Estrutura de dados simples**: A pilha é uma estrutura de dados simples e eficiente para manter controle de informações temporárias, como ativação de funções em uma chamada de pilha ou rastreamento de histórico de ações em uma calculadora.
5. **Implementação**: Uma pilha pode ser implementada usando arrays ou listas encadeadas. A escolha entre essas implementações depende dos requisitos específicos do problema.
6. **Aplicações**: As pilhas são amplamente utilizadas em muitas aplicações, incluindo a implementação de algoritmos recursivos, processamento de expressões matemáticas, gerenciamento de histórico de navegadores da web (para retroceder e avançar), e muito mais.
7. **Eficiência**: As operações básicas de uma pilha (push, pop, top e isEmpty) geralmente têm um tempo de execução constante, tornando-as muito eficientes.

#### Problemas computacionais:

Pilhas são comumente usadas em problemas que envolvem uma ordem específica de processamento ou rastreamento de informações que seguem o principio LIFO.

1. **Expressões Matemáticas**: Pilhas são frequentemente usadas para avaliar expressões matemáticas, especialmente aquelas na notação polonesa reversa (RPN) ou na notação infix (convencional). As pilhas podem ajudar a resolver problemas de análise de expressões e calcular resultados.
2. **Chamadas de Funções**: O mecanismo de chamadas de funções em muitas linguagens de programação é implementado usando uma pilha chamada "call stack" (pilha de chamadas). Isso permite que o programa rastreie a execução de funções e retorne a elas após a conclusão.
3. **Navegação em Árvores e Grafos**: Pilhas são úteis para a navegação em estruturas de dados como árvores e grafos, especialmente durante travessias em profundidade (DFS). Elas permitem rastrear caminhos e estados de maneira recursiva.
4. **Armazenamento de Histórico**: Pilhas podem ser usadas para armazenar um histórico de ações em aplicativos, como navegadores de arquivos e editores de texto, permitindo desfazer e refazer operações.
5. **Solução de Problemas Recursivos**: Muitos problemas recursivos seguem a lógica LIFO, onde a função atual deve ser concluída antes de retornar à chamada anterior. A pilha é usada para rastrear os estados da recursão.

#### Pilha Estática

**Vantagens:**

1. **Simplicidade**: Pilhas estáticas são fáceis de implementar, pois geralmente são baseadas em arrays com tamanho fixo. Isso torna a implementação direta e mais eficiente em termos de uso de memória.
2. **Desempenho Previsível**: Como o tamanho é fixo, o acesso e a manipulação dos elementos da pilha têm desempenho previsível e constante.
3. **Nenhum Gerenciamento de Memória Dinâmica**: Não é necessário alocar ou desalocar memória durante a execução, o que pode simplificar a gestão da memória.

**Desvantagens:**

1. **Tamanho Fixo**: A principal desvantagem é que o tamanho da pilha é fixo e não pode ser alterado dinamicamente. Isso pode levar a problemas se a pilha ficar cheia.
2. **Uso Ineficiente de Memória**: Se o tamanho da pilha for muito grande em relação à quantidade de elementos que realmente contém, haverá desperdício de memória.
3. **Limite de Capacidade**: Uma vez que a capacidade é atingida, não é possível empilhar mais elementos, a menos que você implemente uma lógica complexa para aumentar o tamanho da pilha.

#### Pilha Dinâmica

**Vantagens:**

1. **Tamanho Dinâmico**: As pilhas dinâmicas podem crescer ou encolher conforme necessário, adaptando-se ao uso real. Isso evita o desperdício de memória e permite que você lide com um número variável de elementos.
2. **Flexibilidade**: Como o tamanho não é fixo, as pilhas dinâmicas são mais flexíveis e podem lidar com pilhas de diferentes tamanhos.

**Desvantagens:**

1. **Complexidade**: Implementar uma pilha dinâmica é mais complexo do que uma pilha estática, pois envolve alocação e desalocação de memória. (O Java tem o garbage collection, mas em linguagens como C é necessário que o programador se atente a esse ponto)
2. **Uso de Memória Dinâmica**: O uso de memória dinâmica (alocação e desalocação) pode levar a problemas de gerenciamento de memória se não for feito corretamente. Vazamentos de memória e fragmentação são possíveis.
3. **Desempenho Variável**: O desempenho de uma pilha dinâmica pode ser menos previsível do que o de uma pilha estática, devido às operações de alocação e desalocação de memória.
