## Fila

Uma fila é uma estrutura de dados linear que segue o princípio do "primeiro a entrar, primeiro a sair" (FIFO, do inglês "First-In-First-Out"). Isso significa que o elemento que foi inserido primeiro na fila é o primeiro a ser removido.

As filas tem as seguintes características principais:

1. **FIFO (First-In-First-Out)**: A característica mais fundamental de uma fila é que ela segue o princípio do "primeiro a entrar, primeiro a sair". Isso significa que o elemento que foi enfileirado (inserido) primeiro na fila será o primeiro a ser desenfileirado (removido). Em outras palavras, o elemento mais antigo na fila é o próximo a ser processado ou removido.
2. **Operações básicas**: As filas geralmente suportam duas operações básicas:
    - **Enfileirar (enqueue)**: Isso envolve a inserção de um elemento no final da fila. O novo elemento se torna o último na fila.
    - **Desenfileirar (dequeue)**: Isso envolve a remoção do elemento do início da fila. O elemento que estava na frente da fila é retirado.
3. **Verificação de vazia**: As filas também geralmente suportam uma operação para verificar se estão vazias, ou seja, se não há elementos na fila.
4. **Tamanho dinâmico**: As filas podem crescer ou diminuir dinamicamente à medida que os elementos são enfileirados e desenfileirados.
5. **Uso em algoritmos e estruturas de dados**: As filas são amplamente utilizadas em algoritmos e estruturas de dados, como em algoritmos de busca em largura (BFS) em grafos, gerenciamento de tarefas em sistemas operacionais (por exemplo, a fila de processos a serem executados), agendamento de recursos compartilhados e em muitas outras aplicações.

As filas são uma estrutura de dados fundamental na computação e são essenciais para resolver uma variedade de problemas em programação e algoritmos, onde a ordem de processamento é crítica e deve ser mantida de acordo com o princípio FIFO.

#### Problemas Computacionais

1. **Fila de Tarefas em Sistemas Operacionais**: Em sistemas operacionais, as tarefas a serem executadas são frequentemente gerenciadas em uma fila. O sistema escolhe a próxima tarefa a ser executada da fila com base em uma variedade de critérios, como prioridade.
2. **Balanço de Carga em Servidores**: Em sistemas distribuídos e em servidores de alta disponibilidade, as filas são usadas para equilibrar a carga de trabalho entre os servidores. As requisições são enfileiradas e distribuídas para os servidores disponíveis, garantindo que nenhum servidor fique sobrecarregado.
3. **Controle de Impressão em Impressoras**: Em sistemas de impressão, as filas são usadas para gerenciar a ordem em que os trabalhos de impressão são processados. Os trabalhos são enfileirados e impressos na ordem em que foram recebidos.
4. **Processamento de Requisições em Redes de Computadores**: Em redes de computadores, as filas são usadas para enfileirar e processar pacotes de dados ou requisições de serviços, garantindo que eles sejam tratados na ordem correta e de forma justa.
5. **Gerenciamento de Tarefas em Sistemas de Produção**: Em sistemas de produção, as filas são usadas para gerenciar o fluxo de produtos e tarefas em uma linha de produção, garantindo que os produtos sejam montados na ordem correta.
6. **Processamento de Pedidos em Lojas Online**: Em lojas online, as filas são usadas para gerenciar pedidos de clientes. Os pedidos são enfileirados e processados na ordem em que foram feitos.





### Fila Estática (Array-based Queue):

**Vantagens**:

1. **Uso Eficiente de Memória**: As filas estáticas usam uma quantidade fixa de memória para armazenar os elementos, o que pode ser mais eficiente em termos de uso de memória do que uma fila dinâmica, que aloca e libera memória conforme necessário.
2. **Acesso Aleatório**: Os elementos em uma fila estática podem ser acessados diretamente por índice, o que permite a recuperação de elementos em qualquer posição da fila, se necessário.
3. **Operações Rápidas**: As operações de enfileirar e desenfileirar em uma fila estática geralmente são mais rápidas do que em uma fila dinâmica, pois não há necessidade de realocar memória.
4. **Simplicidade**: A implementação de uma fila estática é geralmente mais simples do que uma fila dinâmica, pois não envolve alocação e liberação dinâmica de memória.

**Desvantagens**:

1. **Capacidade Limitada**: Uma fila estática tem uma capacidade máxima predefinida, e uma vez que essa capacidade é atingida, não é possível adicionar mais elementos sem recriar a fila com uma capacidade maior.
2. **Desperdício de Memória**: Se a capacidade da fila estática for definida muito grande, pode haver desperdício de memória, especialmente se a fila não estiver sempre cheia.
3. **Redimensionamento Ineficiente**: Se a capacidade da fila estiver constantemente próxima de seu limite, pode ser ineficiente redimensionar a fila para acomodar mais elementos.

### Fila Dinâmica (Linked Queue):

**Vantagens**:

1. **Capacidade Dinâmica**: As filas dinâmicas podem crescer ou diminuir conforme necessário, alocando e liberando memória dinamicamente. Isso permite acomodar um número variável de elementos sem desperdício de memória.
2. **Flexibilidade**: Como a capacidade é dinâmica, as filas dinâmicas são mais flexíveis e adequadas para situações em que o número de elementos varia ao longo do tempo.
3. **Implementação Concorrente**: É mais fácil implementar uma fila dinâmica segura para várias threads, pois a alocação de memória pode ser gerenciada de maneira mais flexível.

**Desvantagens**:

1. **Overhead de Memória**: A alocação dinâmica de memória pode introduzir algum overhead em termos de gerenciamento de memória e estruturas de dados adicionais para rastrear os elementos.
2. **Complexidade de Implementação**: A implementação de uma fila dinâmica é geralmente mais complexa do que uma fila estática, devido à necessidade de gerenciamento de memória dinâmica.
3. **Acesso Não Aleatório**: Ao contrário das filas estáticas, as filas dinâmicas não permitem o acesso direto a elementos por índice. Para acessar um elemento em uma posição específica, você deve percorrer a fila a partir do início.