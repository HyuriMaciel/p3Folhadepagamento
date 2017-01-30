import java.util.Scanner;

public class Main {

	static int MAX = 100;

	static Empregado[] emp = new Empregado[MAX];
	static Vendas[] vend = new Vendas[MAX];
	static Servico[] serv = new Servico[MAX];
	static Pontoentrada[] pin = new Pontoentrada[MAX];
	static Pontosaida[] pout = new Pontosaida[MAX];
	static Sindicato[] sin = new Sindicato[MAX];

	static int indiceE = 0;
	static int indiceV = 0;
	static int indiceS = 0;
	static int indiceIN = 0;
	static int indiceOUT = 0;
	static int indceSIND = 0;

	static int dia, mes, ano, hora, minuto, dsemana;

	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);
		Main in = new Main();

		System.out.println("Digite o dia:");
		in.dia = data.nextInt();
		data.nextLine();
		System.out.println("Digite o mes:");
		in.mes = data.nextInt();
		data.nextLine();
		System.out.println("Digite o ano:");
		in.ano = data.nextInt();
		data.nextLine();
		System.out.println("Digite o dia da semana:\n 2-Segunda\n 3-terça\n 4-Quarta\n 5-Quinta\n 6-Sexta");
		in.dsemana = data.nextInt();
		data.nextLine();
		System.out.println("Digite o Hora:");
		in.hora = data.nextInt();
		data.nextLine();
		System.out.println("Digite os minutos:");
		in.minuto = data.nextInt();
		data.nextLine();

		menu();

		System.out.println("Programa encerrado.");

	}

	public static void menu() {

		Scanner input = new Scanner(System.in);

		int opcao = 0;

		do {
			System.out.println("\n\n            == SisPAG - Sistema de Folha para Pagamento  == ");
			System.out.println("\n                  ===============================");
			System.out.println("                  |     1 - Empregado             |");
			System.out.println("                  |     2 - Ponto                 |");
			System.out.println("                  |     3 - Venda                 |");
			System.out.println("                  |     4 - Servico               |");
			System.out.println("                  |     5 - Folha de Pagamento    |");
			System.out.println("                  |     6 - Rendo                 |");
			System.out.println("                  |     7 - Agenda                |");
			System.out.println("                  |     0 - Sair                  |");
			System.out.println("                  ===============================\n");

			opcao = input.nextInt();

			System.out.print("\n");

			switch (opcao) {
			// Empregado
			case 1:

				int opc;

				System.out.println("\n                  =================================");
				System.out.println("                  |     1 - Novo empregado         |");
				System.out.println("                  |     2 - Exibe Empregados       |");
				System.out.println("                  |     3 - Buscar Empregado       |");
				System.out.println("                  |     4 - Excluir Empregado      |");
				System.out.println("                  |     5 - Editar dados Empregado |");
				System.out.println("                  =================================\n");
				opc = input.nextInt();

				if (opc == 1) {
					cadastro();
				}
				if (opc == 2) {

					getEmpregados();

				}
				if (opc == 3) {
					int op1;
					System.out.println("Digite o ID do Empregado");
					op1 = input.nextInt();
					getEmp(op1);

				}
				if (opc == 4) {
					int idd;
					System.out.println("Digite o ID do Empregado");
					idd = input.nextInt();
					deleteEmp(idd);
				}
				if (opc == 5) {
					int opi;
					System.out.println("Digite o ID do Empregado");
					opi = input.nextInt();
					editarEmp(opi);

				} else {
					menu();
				}

				break;

			// PONTO
			case 2:
				int opc1;

				System.out.println("\n                  ===============================");
				System.out.println("                  |     1 - Entrada               |");
				System.out.println("                  |     2 - Saida                 |");
				System.out.println("                  ===============================\n");
				opc1 = input.nextInt();

				if (opc1 == 1) {
					int op2;
					System.out.println("Digite o ID do Empregado");
					op2 = input.nextInt();
					pontoIn(op2);
				}
				if (opc1 == 2) {
					int op3;
					System.out.println("Digite o ID do Empregado");
					op3 = input.nextInt();
					pontoOut(op3);

				}
				if (opc1 == 3) {
					int idp, mp;
					System.out.println("Digite o ID do Empregado");
					idp = input.nextInt();
					System.out.println("Digite o mes");
					mp = input.nextInt();
					gethorastrab(idp, mp);
				} else {
					menu();
				}

				break;

			// VENDAS
			case 3:

				int op4;
				System.out.println("\n                  ===============================");
				System.out.println("                  |     1 - Nova Venda           |");
				System.out.println("                  |     2 - Historico Vendas     |");
				System.out.println("                  ===============================\n");
				op4 = input.nextInt();

				if (op4 == 1) {
					System.out.println("Digite o ID do Empregado");
					op4 = input.nextInt();
					venda(op4);
				}
				if (op4 == 2) {
					System.out.println("Digite o ID do Empregado");
					op4 = input.nextInt();
					getvenda(op4);
				} else {
					menu();
				}

				break;

			// SERVICO
			case 4:

				int op5;
				System.out.println("\n                  ===============================");
				System.out.println("                  |     1 - Novo Servico         |");
				System.out.println("                  |     2 - Historico Servico    |");
				System.out.println("                  ===============================\n");
				op5 = input.nextInt();

				if (op5 == 1) {
					System.out.println("Digite o ID do Empregado");
					op5 = input.nextInt();
					venda(op5);
				}
				if (op5 == 2) {
					System.out.println("Digite o ID do Empregado");
					op5 = input.nextInt();
					getvenda(op5);
				} else {
					menu();
				}

				break;

			case 5:
				int opc2;

				System.out.println("\n                  ================================================");
				System.out.println("                  |     1 - Gera Folha de pagamento               |");
				System.out.println("                  |     2 - Gera Folha de pagamento individual    |");
				System.out.println("                  =================================================\n");
				opc2 = input.nextInt();

				if (opc2 == 1) {
					int dia1;
					int mes1;
					int dia2;
					System.out.println("digite o dia de fechamento: ");
					dia1 = input.nextInt();
					System.out.println("digite o mes de fechamento: ");
					mes1 = input.nextInt();
					System.out.println(
							"digite o dia da semana de fechamento:\n 2-Segunda\n 3-terça\n 4-Quarta\n 5-Quinta\n 6-Sexta ");
					dia2 = input.nextInt();
					folhapag(dia1, mes1);

				}
				if (opc2 == 2) {
					int dia2;
					int mes2;
					int id1;
					int diass;

					System.out.println("digite o ID do Empregado: ");
					id1 = input.nextInt();
					System.out.println("digite o dia de fechamento: ");
					dia2 = input.nextInt();
					System.out.println("digite o mes de fechamento: ");
					mes2 = input.nextInt();
					System.out.println(
							"digite o dia da semana de fechamento:\n 2-Segunda\n 3-terça\n 4-Quarta\n 5-Quinta\n 6-Sexta ");
					diass = input.nextInt();

					folhaEmpID(id1, dia2, mes2);

				} else {
					menu();
				}

				break;
			case 6:

				int opur;
				System.out.println("\n                  ===============================");
				System.out.println("                  |     1 - Undo                  |");
				System.out.println("                  |     2 - Redo                  |");
				System.out.println("                  ===============================\n");
				opur = input.nextInt();
				if (opur == 1) {

				}
				if (opur == 2) {

				} else {
					menu();
				}

				break;
			case 7:
				int ag;
				System.out.println("\n                ==============================================");
				System.out.println("                  |     1 - Agenda dia de pagamentos    |");
				System.out.println("                  |     2 - Agenda Individual           |");
				System.out.println("                  |     3 - Alterar forma de pagamento  |");
				System.out.println("                  =============================================\n");
				ag = input.nextInt();

				if (ag == 1) {
					getagenda();

				}
				if (ag == 2) {
					int agid;
					System.out.println("Digite o ID do Empregado");
					agid = input.nextInt();
					agendaEmp(agid);
				}
				if (ag == 3) {
					int idag;
					System.out.println("Digite o ID do Empregado");
					idag = input.nextInt();
					alterTipo(idag);
				} else {
					menu();
				}

				break;
			case 0:

				break;

			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (opcao != 0);
	}

	public static void cadastro() {

		Scanner dados = new Scanner(System.in);
		Empregado Empregado = new Empregado();
        Sindicato sindicat = new Sindicato();
		System.out.println("Nome do novo empregado");
		String nome = dados.nextLine();
		Empregado.nome = nome;

		System.out.println("Endereço");
		String endereco = dados.nextLine();
		Empregado.endereco = endereco;

		System.out.println("Tipo de funcionaro:\n 1 - Horiasta \n 2- Assalarioado \n3- Comissionado");

		int tipo = dados.nextInt();
		Empregado.tipo = tipo;

		System.out.println("Forma de pagamento:\n 1- Cheque pelos correios\n 2- Chque em maos\n 3- Deposito Bancario ");

		int pagamento = dados.nextInt();
		Empregado.pagamento = pagamento;

		System.out.println("Deseja se associar ao sindicato: \n 1- sim\n 2- Nao");

		int sindicato = dados.nextInt();
		Empregado.sindicato = sindicato;

		System.out.println("Salario");
		double salario = dados.nextDouble();

		// forma de salario horista (1)
		if (tipo == 1) {
			Empregado.salarioH = salario;

		}
		// forma de salario mensal (2)
		if (tipo == 2) {
			Empregado.salarioM = salario;

		}
		// forma de salario comissão (3)
		if (tipo == 3) {
			Empregado.comissao = salario;
			System.out.println("Digite o falor da comissao: ");
			int vcomissao = dados.nextInt();
			Empregado.valorcomissao = vcomissao;

		}
		Empregado.ativo = true;

		Empregado.id = indiceE;
		sindicat.id = indiceE;
		emp[indiceE] = Empregado;
		sin[indiceE] = sindicat;
		indiceE++;
		


		menu();

	}

	public static void getEmpregados() {

		for (int j = 0; j < indiceE; j++) {
			if (emp[j].ativo == true) {

				System.out.println("\n======================================");
				System.out.print("ID Empregado: ");
				System.out.println(j);
				System.out.print("Nome:");
				System.out.println(emp[j].nome);
				System.out.print("Endereco: ");
				System.out.println(emp[j].endereco);

				// PERTENCE AO SINDICATO
				System.out.print("Pertence ao Sindicato: ");
				if (emp[j].sindicato == 1) {
					System.out.println("Sim");
				}
				if (emp[j].sindicato != 1) {

					System.out.println("Sim");
				}

				// tipo de empregado e seu salario;
				if (emp[j].tipo == 1) {
					System.out.print("Horista ");
					System.out.print("salario por hora: ");
					System.out.println(emp[j].salarioH);

				}
				if (emp[j].tipo == 2) {
					System.out.print("Assalariado- ");
					System.out.print("Salario : ");
					System.out.println(emp[j].salarioM);

				}
				if (emp[j].tipo == 3) {
					System.out.print("Comissionado- ");
					System.out.print("Salario comissao: ");
					System.out.println(emp[j].comissao);

				}
				// forma de pagamento

				if (emp[j].pagamento == 1) {
					System.out.println("Cheque pelos correios ");
				}
				if (emp[j].pagamento == 2) {
					System.out.println("Chque em maos ");

				}
				if (emp[j].pagamento == 3) {
					System.out.println("Deposito Bancario");
					System.out.println("======================================");
				}

			}
		}
		// menu();
	}

	public static void getEmp(int id) {

		if (emp[id].ativo == true) {
			System.out.println("\n     ======================================");
			System.out.print("ID Empregado: ");
			System.out.println(emp[id].id);
			System.out.print("Nome: ");
			System.out.println(emp[id].nome);
			System.out.print("Endereco:");
			System.out.println(emp[id].endereco);
			System.out.print("Pertence ao Sindicatp: ");
			if (id < indiceE) {
				// PERTENCE AO SINDICATO
				System.out.print("Pertence ao Sindicato: ");
				if (emp[id].sindicato == 1) {
					System.out.println("Sim");
				}
				if (emp[id].sindicato != 1) {

					System.out.println("Sim");
				}
				// TIPO DE EMPREGADO E SALARIO
				if (emp[id].tipo == 1) {
					System.out.print("salario por hora: ");
					System.out.println(emp[id].salarioH);
					System.out.println("\n");
				}
				if (emp[id].tipo == 2) {
					System.out.print("salario mensal:");
					System.out.println(emp[id].salarioM);
					System.out.println("\n");
				}
				if (emp[id].tipo == 3) {
					System.out.print("comissao:");
					System.out.println(emp[id].comissao);
					System.out.println("\n");
				}

				// forma de pagamento
				if (emp[id].pagamento == 1) {
					System.out.print("Cheque pelos correios ");
					System.out.println("\n");
				}
				if (emp[id].pagamento == 2) {
					System.out.print("Chque em maos ");
					System.out.println("\n");
				}
				if (emp[id].pagamento == 3) {
					System.out.print("Deposito Bancario");
					System.out.println("\n");
				}

				System.out.println("======================================");
			}
		} else {
			System.out.print("ID invalido ");
		}
		menu();

	}

	public static void deleteEmp(int id) {
		emp[id].ativo = false;

	}

	public static void editarEmp(int id) {

		Scanner editar = new Scanner(System.in);
		Empregado e = new Empregado();

		System.out.println("Digete o nome: ");
		String novonome = editar.nextLine();
		emp[id].nome = novonome;
		System.out.println("Digite o endereço: ");
		String novoend = editar.nextLine();
		emp[id].endereco = novoend;
		System.out.println(
				"Digite o metodo de pagamento: \n 1- Cheque pelos correios\n 2- Chque em maos\n 3- Deposito Bancario");
		int novopag = editar.nextInt();
		emp[id].pagamento = novopag;
		System.out.println("Digite a opcao do sindicado: \n 1- sim\n 2- Nao ");
		int novosind = editar.nextInt();
		emp[id].sindicato = novosind;

		menu();

	}

	public static void pontoIn(int id) {

		Scanner dados1 = new Scanner(System.in);
		Pontoentrada pontoin = new Pontoentrada();

		pontoin.id = id;
		System.out.println("Digite o dia");
		int dia = dados1.nextInt();
		pontoin.diain = dia;

		System.out.println("Digite o mes");
		dados1.nextLine();
		int mes = dados1.nextInt();
		pontoin.mesin = mes;

		System.out.println("Digite o dia da semana:\n 2-Segunda\n 3-terça\n 4-Quarta\n 5-Quinta\n 6-Sexta");

		int dsemanain = dados1.nextInt();
		pontoin.dsemanain = dsemanain;

		System.out.println("Digite a hora");

		int hora = dados1.nextInt();
		pontoin.horain = hora;

		System.out.println("Digite o minuto");

		int minuto = dados1.nextInt();
		pontoin.minutoin = minuto;

		pin[indiceIN] = pontoin;
		indiceIN++;

		menu();

	}

	public static void pontoOut(int id) {

		Scanner dados2 = new Scanner(System.in);
		Pontosaida pontoout = new Pontosaida();

		pontoout.id = id;
		System.out.println("Digite o dia");
		int dia = dados2.nextInt();
		pontoout.diaout = dia;

		System.out.println("Digite o mes");

		int mes = dados2.nextInt();
		pontoout.mesout = mes;

		System.out.println("Digite o dia da semana:\n 2-Segunda\n 3-terça\n 4-Quarta\n 5-Quinta\n 6-Sexta");
		dados2.nextLine();
		int dsemanaout = dados2.nextInt();
		pontoout.dsemanaout = dsemanaout;

		System.out.println("Digite a hora");

		int hora = dados2.nextInt();
		pontoout.horaout = hora;

		System.out.println("Digite o minuto");

		int minuto = dados2.nextInt();
		pontoout.minutoout = minuto;

		pout[indiceOUT] = pontoout;
		indiceOUT++;

		menu();

	}

	public static void gethorastrab(int id, int mes) {

		int hentrada = 0;
		int hsaida = 0;
		int mentrada = 0;
		int msaida = 0;
		int aux1, aux2, aux3, aux4;
		int total;

		for (int i = 0; i < indiceIN; i++) {
			if ((pin[i].id == id) && (pin[i].mesin == mes)) {
				hentrada = hentrada + pin[i].horain;
				mentrada = mentrada + pin[i].minutoin;
			}
		}

		for (int j = 0; j < indiceOUT; j++) {
			if ((pout[j].id == id) && (pout[j].mesout == mes)) {
				hsaida = hsaida + pin[j].horain;
				msaida = msaida + pin[j].minutoin;
			}
		}
		aux1 = mentrada / 60;
		aux2 = msaida / 60;
		aux3 = hentrada + aux1;
		aux4 = hsaida + aux2;
		total = aux4 - aux3;
		System.out.println("======================================");
		System.out.print("Empregado: ");
		System.out.println(emp[id].nome);
		System.out.print("No mes ");
		System.out.print(mes);
		System.out.print("trabalhou: ");
		System.out.print(total);
		System.out.print(" horas.");
		System.out.println("======================================");

	}

	public static void venda(int id) {
		Scanner dados3 = new Scanner(System.in);
		Vendas ven = new Vendas();

		ven.id = id;

		System.out.println("Dia da venda");

		int dia = dados3.nextInt();
		ven.diav = dia;

		System.out.println("Mes da venda");

		int mes = dados3.nextInt();
		ven.mesv = mes;

		System.out.println("Digite o dia da semana:\n 2-Segunda\n 3-terça\n 4-Quarta\n 5-Quinta\n 6-Sexta");

		int dsemanav = dados3.nextInt();
		ven.dsemanav = dsemanav;

		System.out.println("Digite o Valor");

		double valor = dados3.nextDouble();
		ven.valorv = valor;

		vend[indiceV] = ven;
		indiceV++;

		menu();

	}

	public static void getvenda(int id) {

		Vendas gvenda = new Vendas();

		if (emp[id].ativo == true) {
			System.out.println("======================================");
			System.out.print("Empregado: ");
			System.out.println(emp[id].nome);
			System.out.print("Dia e Mes da venda: ");
			System.out.print(vend[id].diav);
			System.out.print("/");
			System.out.println(vend[id].mesv);
			System.out.print("Valor: ");
			System.out.println(vend[id].valorv);
			System.out.println("======================================");

		} else {
			System.out.print("ID não encontrado");
		}
		menu();

	}

	public static void servico(int id) {

		Scanner dados4 = new Scanner(System.in);
		Servico servico = new Servico();

		servico.id = id;

		System.out.println("Dia da venda");

		int dia = dados4.nextInt();
		servico.dias = dia;

		System.out.println("Dia da venda");

		int mes = dados4.nextInt();
		servico.mess = mes;

		System.out.println("Digite o dia da semana:\n 2-Segunda\n 3-terça\n 4-Quarta\n 5-Quinta\n 6-Sexta");

		int dsemanas = dados4.nextInt();
		servico.dsemanas = dsemanas;

		System.out.println("Digite o Valor");

		double valor = dados4.nextDouble();
		servico.valors = valor;

		serv[indiceV] = servico;
		indiceS++;

		menu();

	}

	public static void getservico(int id) {
		
		

		if (emp[id].ativo == true) {
			System.out.println("======================================");
			System.out.print("Empregado: ");
			System.out.println(emp[id].nome);
			System.out.print("Dia e Mes da venda: ");
			System.out.print(serv[id].dias);
			System.out.print("/");
			System.out.println(serv[id].mess);
			System.out.print("Valor: ");
			System.out.println(serv[id].valors);
			System.out.println("======================================");

		} else {
			System.out.print("ID não encontrado. ");
		
		}
		menu();

	}

	public static int diastrabalhados(int id, int dia, int mes) {

		int dias = 0;
		int i;
		for (i = 0; i <= indiceIN; i++) {
			if ((pin[id].id == id) && (pin[id].mesin <= mes) && (pin[id].diain <= dia)) {
				dias++;
			}
		}
		return (dias);
	}

	public static double horastrabalhadas(int id, int dia, int mes) {
		double horain = 0;
		double minutoin = 0;
		double minutoout = 0;
		double horaout = 0;
		double totalhorasin;
		double totalhoraout;
		double convermin;
		double convermout;
		double totalHoras = 0;

		int i;

		// soma as horas de
		for (i = 0; i <= indiceOUT; i++) {
			if ((pin[id].id == id) && (pin[id].mesin <= mes) && (pin[id].diain <= dia)) {
				horain = pin[id].horain;
				minutoin = pin[id].minutoin;
			}
			if ((pout[id].id == id) && (pout[id].mesout <= mes) && (pout[id].diaout <= dia)) {
				horaout = pout[id].horaout;
				minutoout = pout[id].minutoout;

			}
			convermin = (minutoin / 60);
			convermout = (minutoout / 60);
			totalhorasin = horain + convermin;
			totalhoraout = horaout + convermout;

			totalHoras = totalHoras + (totalhoraout - totalhorasin);

		}

		return (totalHoras);

	}

	public static double totalVendas(int id, int dia, int mes) {
		double totalv = 0;
		double total = 0;
		int i;
		// total de vendas
		for (i = 0; i < indiceV; i++) {
			if ((vend[id].id == id) && (vend[id].mesv <= mes) && (vend[id].diav <= dia)) {

				totalv = (vend[id].valorv * emp[id].valorcomissao) / 100;
			}
			total = total + totalv;
		}

		return (total);
	}

	public static double totalServico(int id, int dia, int mes) {

		double totals = 0;
		double total = 0;
		int i;
		// total de vendas
		for (i = 0; i < indiceS; i++) {
			if ((serv[id].id == id) && (serv[id].mess <= mes) && (serv[id].dias <= dia)) {

				totals = (serv[id].valors * emp[id].valorcomissao) / 100;

			}
			total = total + totals;
		}

		return (total);

	}

	public static void folhapag(int dia, int mes) {

		Sindicato sindicato = new Sindicato();

		int k;
		double salariop = 0;
		double salariot = 0;
		double horast = 0;
		double vendat = 0;
		double servt = 0;
		double descontos = 0;
		double aux = 0;
		for (k = 0; k < indiceE; k++) {
			
			if (emp[k].ativo == true) {
				// empregado horista
				if (emp[k].tipo == 1) {
					
					horast = horastrabalhadas(k, dia, mes);
					// verifica se pertence ao sindicato
					if (emp[k].sindicato == 1) {
						
						salariop = emp[k].salarioH * horast;
						descontos = ((salariop * sindicato.taxaH) / 100);
						salariot = (salariop - descontos);
						System.out.println("============================================ ");
						System.out.print(emp[k].id);
						System.out.print(" - ");
						System.out.println(emp[k].nome);
						System.out.println("tipo de funcionario: Horista ");
						System.out.print("valor por hora trabalhada: ");
						System.out.println(emp[k].salarioH);
						System.out.print("Valor a receber: ");
						System.out.println(salariot);
						System.out.println("============================================ ");

					}
					if (emp[k].sindicato == 2) {
						salariop = (emp[k].salarioH * horast);

						System.out.println("============================================ ");
						System.out.print(emp[k].id);
						System.out.print(" - ");
						System.out.println(emp[k].nome);
						System.out.println("tipo de funcionario: Horista ");
						System.out.print("valor por hora trabalhada: ");
						System.out.println(emp[k].salarioH);
						System.out.print("Valor a receber: ");
						System.out.println(salariot);
						System.out.println("============================================ ");
					}

				}
				// empregado comissionado
				if (emp[k].tipo == 3) {
					
					vendat = totalVendas(k, dia, mes);
					servt = totalServico(k, dia, mes);

					if (emp[k].sindicato == 1) {
						descontos = ((salariop * sindicato.taxaC) / 100);
						salariot = ((emp[k].comissao + vendat + servt) - descontos);

						System.out.println("============================================ ");
						System.out.print(emp[k].id);
						System.out.print(" - ");
						System.out.println(emp[k].nome);
						System.out.println("tipo de funcionario: Comissionado ");
						System.out.print("valor da comissao a receber: ");
						System.out.println(vendat);
						System.out.print("Valor a receber: ");
						System.out.println(salariot);
						System.out.println("============================================ ");
					}
					if (emp[k].sindicato == 2) {

						salariot = (emp[k].comissao + vendat + servt);

						System.out.println("============================================ ");
						System.out.print(emp[k].id);
						System.out.print(" - ");
						System.out.println(emp[k].nome);
						System.out.println("tipo de funcionario: Comissionado ");
						System.out.print("valor da comissao a receber: ");
						System.out.println(vendat);
						System.out.print("Valor a receber: ");
						System.out.println(salariot);
						System.out.println("============================================ ");
					}

				}
				// empregado mensalista
				if (emp[k].tipo == 2) {
					
					if (emp[k].sindicato == 1) {
						
						salariop = ((emp[k].salarioM * sindicato.taxaF) / 100);
						
						salariot = emp[k].salarioM - salariop;

						System.out.println("============================================ ");
						System.out.print(emp[k].id);
						System.out.print(" - ");
						System.out.println(emp[k].nome);
						System.out.println("tipo de funcionario: Assalariados ");
						System.out.print("Valor a receber: ");
						System.out.println(salariot);
						System.out.println("============================================ ");

					}
					if (emp[k].sindicato == 2) {

						salariot = emp[k].salarioM;
						System.out.println("============================================ ");
						System.out.print(emp[k].id);
						System.out.print(" - ");
						System.out.println(emp[k].nome);
						System.out.println("tipo de funcionario: Assalariados ");
						System.out.print("Valor a receber: ");
						System.out.println(salariot);
						System.out.println("============================================ ");

					}

				}

			}
		}
		menu();

	}

	public static void folhaEmpID(int id, int dia, int mes) {

		Sindicato sindicato = new Sindicato();

		double salariop = 0;
		double salariot = 0;
		double horast = 0;
		double vendat = 0;
		double servt = 0;
		double descontos = 0;
		double aux = 0;

		if (emp[id].ativo == true) {
			// empregado horista
			if (emp[id].tipo == 1) {
				horast = horastrabalhadas(id, dia, mes);
				// verifica se pertence ao sindicato

				if (emp[id].sindicato == 1) {

					salariop = emp[id].salarioH * horast;
					descontos = (salariop * sindicato.taxaH) / 100;
					salariot = salariop - descontos;

					System.out.println("============================================ ");
					System.out.print(emp[id].id);
					System.out.print(" - ");
					System.out.println(emp[id].nome);
					System.out.println("tipo de funcionario: Horista ");
					System.out.print("valor por hora trabalhada: ");
					System.out.println(emp[id].salarioH);
					System.out.print("Valor a receber: ");
					System.out.println(salariot);
					System.out.println("============================================ ");

				}
				if (emp[id].sindicato == 2) {

					salariop = (emp[id].salarioH * horast);

					System.out.println("============================================ ");
					System.out.print(emp[id].id);
					System.out.print(" - ");
					System.out.println(emp[id].nome);
					System.out.println("tipo de funcionario: Horista ");
					System.out.print("valor por hora trabalhada: ");
					System.out.println(emp[id].salarioH);
					System.out.print("Valor a receber: ");
					System.out.println(salariot);
					System.out.println("============================================ ");

				}

			}
			// empregado comissionado
			if (emp[id].tipo == 3) {
				vendat = totalVendas(id, dia, mes);
				servt = totalServico(id, dia, mes);

				if (emp[id].sindicato == 1) {
					descontos = (salariop * sindicato.taxaC) / 100;
					salariot = (emp[id].comissao + vendat + servt) - descontos;

					System.out.println("============================================ ");
					System.out.print(emp[id].id);
					System.out.print(" - ");
					System.out.println(emp[id].nome);
					System.out.println("tipo de funcionario: Comissionado ");
					System.out.print("valor da comissao a receber: ");
					System.out.println(vendat);
					System.out.print("Valor a receber: ");
					System.out.println(salariot);
					System.out.println("============================================ ");
				}
				if (emp[id].sindicato == 2) {

					salariot = (emp[id].comissao + vendat + servt);

					System.out.println("============================================ ");
					System.out.print(emp[id].id);
					System.out.print(" - ");
					System.out.println(emp[id].nome);
					System.out.println("tipo de funcionario: Comissionado ");
					System.out.print("valor da comissao a receber: ");
					System.out.println(vendat);
					System.out.print("Valor a receber: ");
					System.out.println(salariot);
					System.out.println("============================================ ");
				}

			}
			// empregado mensalista
			if (emp[id].tipo == 2) {
				if (emp[id].sindicato == 1) {

					salariop = (emp[id].salarioM * sindicato.taxaF) / 100;
					salariot = emp[id].salarioM - salariop;

					System.out.println("============================================ ");
					System.out.print(emp[id].id);
					System.out.print(" - ");
					System.out.println(emp[id].nome);
					System.out.println("tipo de funcionario: Assalariados ");
					System.out.print("Valor a receber: ");
					System.out.println(salariot);
					System.out.println("============================================ ");

				}
				if (emp[id].sindicato == 2) {

					salariot = emp[id].salarioM;

					System.out.println("============================================ ");
					System.out.print(emp[id].id);
					System.out.print(" - ");
					System.out.println(emp[id].nome);
					System.out.println("tipo de funcionario: Assalariados ");
					System.out.print("Valor a receber: ");
					System.out.println(salariot);
					System.out.println("============================================ ");

				}

			}

		}

		menu();

	}

	// retorna quantod dias falta pra receber
	public static int calendarioC() {
		Main aux = new Main();

		int aux1 = 0;

		if (aux.dia < 15) {
			aux1 = 15 - aux.dia;

		}
		if (aux.dia > 15) {
			aux1 = 30 - aux.dia;

		}

		return (aux1);

	}

	// retorna quantod dias falta pra receber mensalista
	public static int calendarioS() {
		Main aux = new Main();

		int aux1 = 0;

		aux1 = 30 - aux.dia;

		return (aux1);

	}

	// retorna o dia que o horista vai receber
	public static int calendarioH() {
		Main aux = new Main();

		int aux1 = 0;

		if (aux.dsemana == 2) {
			aux1 = aux.dia + 4;

			if (aux1 >= 30) {
				aux1 = aux1 - 30;
			}
		}
		if (aux.dsemana == 3) {
			aux1 = aux.dia + 3;
			if (aux1 >= 30) {
				aux1 = aux1 - 30;
			}
		}
		if (aux.dsemana == 4) {
			aux1 = aux.dia + 2;
			if (aux1 >= 30) {
				aux1 = aux1 - 30;
			}
		}
		if (aux.dsemana == 5) {
			aux1 = aux.dia + 1;
			if (aux1 >= 30) {
				aux1 = aux1 - 30;
			}

		}
		if (aux.dsemana == 6) {
			aux1 = 0;
		}

		return (aux1);

	}

	public static int calendarioDia(int prox) {
		Main aux = new Main();

		int aux1 = 0;
		int aux2 = 0;

		aux1 = aux.dsemana + prox;

		if (aux1 <= 6) {

		}
		if (aux1 > 30) {
			aux2 = aux1 - 30;
		} else {
			aux2 = aux1 % 8;
			aux1 = aux2 + 1;

		}
		return (aux1);
	}

	public static void getagenda() {
		int auxc;
		int auxh;
		int auxa;

		auxc = calendarioC();

		auxa = calendarioS();

		auxh = calendarioH();
		System.out.println("============================================ ");

		System.out.println("Os empregados Horistas vao receber Todas as sextas");
		System.out.print("proximo pagamento dia:  ");
		System.out.println(auxh);

		System.out.println("Os empregados Comissionados vao receber a cada duas semanas");
		System.out.print("faltam  ");
		System.out.print(auxc);
		System.out.println(" para pagamento");

		System.out.println("Os empregados Assalariados vao receber Ultimo dia do mes:");
		System.out.print("faltam  ");
		System.out.print(auxa);
		System.out.println(" para pagamento");

		System.out.println("============================================ ");

	}

	public static void agendaEmp(int id) {

		int aux;
		int auxc;
		int auxh;
		int auxa;

		auxc = calendarioC();

		auxa = calendarioS();

		auxh = calendarioH();

		aux = emp[id].tipo;

		if (emp[id].ativo == true) {
			
			if (aux == 1) {
				System.out.println("============================================ ");
				System.out.println(emp[id].nome);
				System.out.println("Recebe semanalmente ");
				System.out.print("Faltam ");
				System.out.print(auxh);
				System.out.println(" dias para receber ");
				System.out.println("============================================ ");

			}
			if (aux == 2) {
				System.out.println("============================================ ");
				System.out.println(emp[id].nome);
				System.out.println("Recebe mensalmente ");
				System.out.print("Faltam ");
				System.out.print(auxa);
				System.out.println(" dias para receber ");
				System.out.println("============================================ ");

			}
			if (aux == 3) {
				System.out.println("============================================ ");
				System.out.println(emp[id].nome);
				System.out.println("Recebe bi-semanalmente");
				System.out.print("Faltam ");
				System.out.print(auxc);
				System.out.println(" sias para receber ");
				System.out.println("============================================ ");

			}
		} else {
			System.out.print("ID não encontrado ");
		}
		menu();

	}

	public static void alterTipo(int id) {

		Scanner ntipo = new Scanner(System.in);
		int novotipo;
		int aux;
		aux = emp[id].tipo;
		if (emp[id].ativo == true) {

			if (aux == 1) {
				System.out.println(emp[id].nome);
				System.out.println("Recebe semanalmente ");
				System.out.println("Deseja alterar para qual forma de paragameto: ");
				System.out.println("2- Mensalmente 3- Bi-semanalmente");
				System.out.println("Digite o novo tipo");
				novotipo = ntipo.nextInt();
				emp[id].tipo = novotipo;

			}
			if (aux == 2) {
				System.out.println(emp[id].nome);
				System.out.println("Recebe mensalmente ");
				System.out.println("Deseja alterar para qual forma de paragameto: ");
				System.out.println("1- Semanalmente 3- Bi-semanalmente");
				System.out.println("Digite o novo tipo");
				novotipo = ntipo.nextInt();
				emp[id].tipo = novotipo;

			}

			if (aux == 3) {
				System.out.println(emp[id].nome);
				System.out.println("Recebe bi-semanalmente");
				System.out.println("Deseja alterar para qual forma de paragameto: ");
				System.out.print("1- Semanalmente 2- Mensalmente");
				System.out.println("Digite o novo tipo");
				novotipo = ntipo.nextInt();
				emp[id].tipo = novotipo;

			}

		} else {
			System.out.println("ID não encontrado.");
		}
		menu();
	}

}




