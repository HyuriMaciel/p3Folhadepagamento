import java.util.Scanner;

public class Main {

	static int MAX = 100;

	static Empregado[] emp = new Empregado[MAX];
	static Vendas[] vend = new Vendas[MAX];
	static Servico[] serv = new Servico[MAX];
	static Pontoentrada[] pin = new Pontoentrada[MAX];
	static Pontosaida[] pout = new Pontosaida[MAX];

	static int indiceE = 0;
	static int indiceV = 0;
	static int indiceS = 0;
	static int indiceIN = 0;
	static int indiceOUT = 0;

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
			System.out.println("                  |     6 - Undo//Rendo           |");
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
					int op;
					System.out.println("Digite o ID do Empregado");
					op = input.nextInt();
					// deleteEmp(op);
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

				} else {
					menu();
				}

				break;

			// VENDAS
			case 3:

				int op4;
				System.out.println("Digite o ID do Empregado");
				op4 = input.nextInt();
				venda(op4);

				break;

			// SERVICO
			case 4:

				int op5;
				System.out.println("Digite o ID do Empregado");
				op5 = input.nextInt();
				servico(op5);

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
					folhapag(dia2, dia1, mes1);

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

					folhaEmpID(id1, diass, dia2, mes2);

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
		}

		Empregado.id = indiceE;
		emp[indiceE] = Empregado;
		indiceE++;

		menu();

	}

	public static void getEmpregados() {

		for (int j = 0; j < indiceE; j++) {

			System.out.println("\n*****************************");
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

				if (emp[j].pagamento == 2) {
					System.out.println("Chque em maos ");

				}
				if (emp[j].pagamento == 3) {
					System.out.println("Deposito Bancario");
					System.out.println("************************************");
				}

			}
		}

		// menu();
	}

	public static void getEmp(int id) {

		System.out.println("\n     *****************************");
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

			System.out.println("************************************");
		} else {
			System.out.print("ID invalido ");
		}
		menu();

	}

	public void deleteEmp(int id) {

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
		dados1.nextLine();
		int dsemanain = dados1.nextInt();
		pontoin.dsemanain = dsemanain;

		System.out.println("Digite a hora");
		dados1.nextLine();
		int hora = dados1.nextInt();
		pontoin.horain = hora;

		System.out.println("Digite o minuto");
		dados1.nextLine();
		int minuto = dados1.nextInt();
		pontoin.minutoin = minuto;

		pin[indiceV] = pontoin;
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
		dados2.nextLine();
		int mes = dados2.nextInt();
		pontoout.mesout = mes;

		System.out.println("Digite o dia da semana:\n 2-Segunda\n 3-terça\n 4-Quarta\n 5-Quinta\n 6-Sexta");
		dados2.nextLine();
		int dsemanaout = dados2.nextInt();
		pontoout.dsemanaout = dsemanaout;

		System.out.println("Digite a hora");
		dados2.nextLine();
		int hora = dados2.nextInt();
		pontoout.horaout = hora;

		System.out.println("Digite o minuto");
		dados2.nextLine();
		int minuto = dados2.nextInt();
		pontoout.minutoout = minuto;

		pout[indiceV] = pontoout;
		indiceOUT++;

		menu();

	}

	public static void venda(int id) {
		Scanner dados3 = new Scanner(System.in);
		Vendas ven = new Vendas();

		ven.id = id;

		System.out.println("Dia da venda");

		int dia = dados3.nextInt();
		ven.diav = dia;

		System.out.println("Dia da venda");

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

				totalv = (vend[id].porvenda / vend[id].valorv);
			}
			total = total + totalv;
		}

		return (totalv);
	}

	public static double totalServico(int id, int dia, int mes) {

		double totals = 0;
		double total = 0;
		int i;
		// total de vendas
		for (i = 0; i < indiceS; i++) {
			if ((serv[id].id == id) && (serv[id].mess <= mes) && (serv[id].dias <= dia)) {

				totals = (serv[id].pservico / serv[id].valors);

			}
			total = total + totals;
		}

		return (total);

	}

	public static void folhapag(int diasem, int dia, int mes) {

		Sindicato sindicato = new Sindicato();

		int k;
		double salario = 0;
		double salariot = 0;
		double horast = 0;
		double vendat = 0;
		double servt = 0;

		for (k = 0; k < indiceE; k++) {

			if (emp[k].nome != null) {

				if (emp[k].tipo == 2) {

					salario = emp[k].salarioM;

					if (((dia == 30) && (diasem == 2 || diasem == 3 || diasem == 4 || diasem == 5 || diasem == 6))
							|| ((dia == 31)
									&& (diasem == 2 || diasem == 3 || diasem == 4 || diasem == 5 || diasem == 6))
							|| ((dia == 29)
									&& (diasem == 2 || diasem == 3 || diasem == 4 || diasem == 5 || diasem == 6))
							|| ((dia == 28)
									&& (diasem == 2 || diasem == 3 || diasem == 4 || diasem == 5 || diasem == 6))) {

						if (emp[k].sindicato == 1) {
							salariot = salariot - (sindicato.taxaF / 100);

							System.out.println("\n-----------------------------");
							System.out.print("ID: ");
							System.out.println(emp[k].id);
							System.out.print("Empregado: ");
							System.out.println(emp[k].nome);
							System.out.print("Salario: ");
							System.out.println(salariot);
							System.out.println("\n-----------------------------");

						} else {
							System.out.println("\n-----------------------------");
							System.out.print("ID: ");
							System.out.println(emp[k].id);
							System.out.print("Empregado: ");
							System.out.println(emp[k].nome);
							System.out.print("Salario: ");
							System.out.println(salariot);
							System.out.println("\n-----------------------------");

						}

					} else {
						System.out.println("\n-------------------------------------------------");
						System.out.print("ID: ");
						System.out.println(emp[k].id);
						System.out.print("Empregado: ");
						System.out.println(emp[k].nome);
						System.out.println("|Empregado Mensalista ainda nao esta no dia|");
						System.out.println("\n------------------------------------------------");

					}

				}
				if (emp[k].tipo == 3) {
					salario = emp[k].comissao;

					vendat = totalVendas(k, dia, mes);
					servt = totalServico(k, dia, mes);
					salariot = salario + vendat + servt;
					salariot = salariot / 2;
					if (((dia == 15) || (dia == 30) && (diasem == 5))) {

						if (emp[k].sindicato == 1) {
							salariot = salariot - (sindicato.taxaF / 100);
							salariot = salariot - (sindicato.taxaC / 100);

							System.out.println("\n-----------------------------");
							System.out.print("ID: ");
							System.out.println(emp[k].id);
							System.out.print("Empregado: ");
							System.out.println(emp[k].nome);
							System.out.print("Salario: ");
							System.out.println(salariot);
							System.out.println("\n-----------------------------");

						} else {
							System.out.println("\n-----------------------------");
							System.out.print("ID: ");
							System.out.println(emp[k].id);
							System.out.print("Empregado: ");
							System.out.println(emp[k].nome);
							System.out.print("Salario: ");
							System.out.println(salariot);
							System.out.println("\n-----------------------------");

						}

					} else {
						System.out.println("\n-------------------------------------------------");
						System.out.print("ID: ");
						System.out.println(emp[k].id);
						System.out.print("Empregado: ");
						System.out.println(emp[k].nome);
						System.out.println("|Empregado Mensalista ainda nao esta no dia|");
						System.out.println("\n------------------------------------------------");
						;
					}

				}
				if (emp[k].tipo == 1) {
					salario = emp[k].salarioH;
					if (diasem == 5) {
						horast = horastrabalhadas(k, dia, mes);
						salariot = (salario * horast);

						if (emp[k].sindicato == 1) {
							salariot = salariot - (sindicato.taxaF / 100);
							salariot = salariot - (sindicato.taxaH / 100);
							System.out.println("\n-----------------------------");
							System.out.print("ID: ");
							System.out.println(emp[k].id);
							System.out.print("Empregado: ");
							System.out.println(emp[k].nome);
							System.out.print("Salario: ");
							System.out.println(salariot);
							System.out.println("\n-----------------------------");

						} else {
							System.out.println("\n-----------------------------");
							System.out.print("ID: ");
							System.out.println(emp[k].id);
							System.out.print("Empregado: ");
							System.out.println(emp[k].nome);
							System.out.print("Salario: ");
							System.out.println(salariot);
							System.out.println("\n-----------------------------");

						}
					} else {
						System.out.println("\n-------------------------------------------------");
						System.out.print("ID: ");
						System.out.println(emp[k].id);
						System.out.print("Empregado: ");
						System.out.println(emp[k].nome);
						System.out.println("|Empregado Mensalista ainda nao esta no dia|");
						System.out.println("\n------------------------------------------------");
					}

				}

			}

		}

	}

	public static void folhaEmpID(int id, int diasem, int dia, int mes) {

		Sindicato sindicato = new Sindicato();

		double salario = 0;
		double salariot = 0;
		double horast = 0;
		double vendat = 0;
		double servt = 0;
		double salariosemana = 2;
		if (emp[id].tipo == 2) {

			salario = emp[id].salarioM;

			if (((dia == 30) && (diasem == 2 || diasem == 3 || diasem == 4 || diasem == 5 || diasem == 6))
					|| ((dia == 31) && (diasem == 2 || diasem == 3 || diasem == 4 || diasem == 5 || diasem == 6))
					|| ((dia == 29) && (diasem == 2 || diasem == 3 || diasem == 4 || diasem == 5 || diasem == 6))
					|| ((dia == 28) && (diasem == 2 || diasem == 3 || diasem == 4 || diasem == 5 || diasem == 6))) {

				if (emp[id].sindicato == 1) {
					salariot = salariot - (sindicato.taxaF / 100);

					System.out.println("\n-----------------------------");
					System.out.print("ID: ");
					System.out.println(emp[id].id);
					System.out.print("Empregado: ");
					System.out.println(emp[id].nome);
					System.out.print("Salario: ");
					System.out.println(salariot);
					System.out.println("\n-----------------------------");

				} else {
					System.out.println("\n-----------------------------");
					System.out.print("ID: ");
					System.out.println(emp[id].id);
					System.out.print("Empregado: ");
					System.out.println(emp[id].nome);
					System.out.print("Salario: ");
					System.out.println(salariot);
					System.out.println("\n-----------------------------");

				}

			} else {
				System.out.println("\n-------------------------------------------------");
				System.out.print("ID: ");
				System.out.println(emp[id].id);
				System.out.print("Empregado: ");
				System.out.println(emp[id].nome);
				System.out.println("|Empregado Mensalista ainda nao esta no dia|");
				System.out.println("\n------------------------------------------------");
			}

		}
		if (emp[id].tipo == 3) {
			salario = emp[id].comissao;

			vendat = totalVendas(id, dia, mes);
			servt = totalServico(id, dia, mes);
			salariot = salario + vendat + servt;
			salariot = salariot / salariosemana;
			if (((dia == 15) || (dia == 30) && (diasem == 5))) {

				if (emp[id].sindicato == 1) {
					salariot = salariot - (sindicato.taxaF / 100);
					salariot = salariot - (sindicato.taxaC / 100);

					System.out.println("\n-----------------------------");
					System.out.print("ID: ");
					System.out.println(emp[id].id);
					System.out.print("Empregado: ");
					System.out.println(emp[id].nome);
					System.out.print("Salario: ");
					System.out.println(salariot);
					System.out.println("\n-----------------------------");

				} else {
					System.out.println("\n-----------------------------");
					System.out.print("ID: ");
					System.out.println(emp[id].id);
					System.out.print("Empregado: ");
					System.out.println(emp[id].nome);
					System.out.print("Salario: ");
					System.out.println(salariot);
					System.out.println("\n-----------------------------");

				}

			} else {
				System.out.println("\n-------------------------------------------------");
				System.out.print("ID: ");
				System.out.println(emp[id].id);
				System.out.print("Empregado: ");
				System.out.println(emp[id].nome);
				System.out.println("|Empregado Mensalista ainda nao esta no dia|");
				System.out.println("\n------------------------------------------------");
			}

		}

		if (emp[id].tipo == 1) {
			salario = emp[id].salarioH;
			if (diasem == 5) {
				horast = horastrabalhadas(id, dia, mes);
				salariot = (salario * horast);

				if (emp[id].sindicato == 1) {
					salariot = salariot - (sindicato.taxaF / 100);
					salariot = salariot - (sindicato.taxaH / 100);
					System.out.println("\n-----------------------------");
					System.out.print("ID: ");
					System.out.println(emp[id].id);
					System.out.print("Empregado: ");
					System.out.println(emp[id].nome);
					System.out.print("Salario: ");
					System.out.println(salariot);
					System.out.println("\n-----------------------------");

				} else {
					System.out.println("\n-----------------------------");
					System.out.print("ID: ");
					System.out.println(emp[id].id);
					System.out.print("Empregado: ");
					System.out.println(emp[id].nome);
					System.out.print("Salario: ");
					System.out.println(salariot);
					System.out.println("\n-----------------------------");

				}
			} else {
				System.out.println("\n-------------------------------------------------");
				System.out.print("ID: ");
				System.out.println(emp[id].id);
				System.out.print("Empregado: ");
				System.out.println(emp[id].nome);
				System.out.println("|Empregado Mensalista ainda nao esta no dia|");
				System.out.println("\n------------------------------------------------");
			}

		}

	}

	public static void agenda() {

		Main ag = new Main();
		int diainicio;
		int mesinicio;
		int anoinicio;
		int diasemana;
		int numdias = 30;
		int faltames;
		int faltadias;
		int diareceber;
		int aux, diasr;
		
		diainicio = ag.dia;
		mesinicio = ag.mes;
		anoinicio = ag.ano;
		diasemana = ag.dsemana;

		faltames = numdias - diainicio;
		faltadias = 6 - diasemana;

		aux = ag.dsemana - 8;
		diasr = faltames + aux;
		diareceber = diasr / 8;
		if( diareceber == 8 || diareceber == 7){
			
		}

	}
}
