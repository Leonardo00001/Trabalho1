/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho1;

/**
 *
 * @author Leonardo
 */
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        
        Contas objeto1;
        objeto1 = new Contas();
        
        ContaPoupanca objeto2;
        objeto2 = new ContaPoupanca();
        
        ContaEspecial objeto3;
        objeto3 = new ContaEspecial();
        
        int conta1;
        int conta2;
        int conta3;
        
        double saque;
        double deposito;
        double transferencia;
        double reajuste;
        double aux;
        
        int m = 0, q = 0;
        
        String[] ops = {"Saque", "Depósito", "Transfência", "Reajustar", "Ver saldos", "sair"};
        String[] ops2 = {"Confirmar", "Cancelar"};
        String[] op3 = {"Voltar"};

        JOptionPane.showMessageDialog(null, " Bem Vindo(a)!");

        do {
            objeto1.setNome(JOptionPane.showInputDialog(null, "Digite o nome do titular da conta comum: ", "Nome do Titular Conta comum", JOptionPane.QUESTION_MESSAGE));
            objeto1.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da conta comum: ", "Número da Conta comum", JOptionPane.QUESTION_MESSAGE)));
            objeto1.setSaldo(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o saldo de conta comum (R$):", "Saldo Conta comum", JOptionPane.QUESTION_MESSAGE)));

            objeto2.setNome(JOptionPane.showInputDialog(null, "Digite o nome do titular da conta poupança: ", "Nome do Titular Conta poupança", JOptionPane.QUESTION_MESSAGE));
            objeto2.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da conta poupança: ", "Número da Conta poupanca", JOptionPane.QUESTION_MESSAGE)));
            objeto2.setSaldo(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o saldo de conta poupanca (R$):", "Saldo Conta poupanca", JOptionPane.QUESTION_MESSAGE)));

            objeto3.setNome(JOptionPane.showInputDialog(null, "Digite o nome do titular da conta especial: ", "Nome do Titular Conta especial", JOptionPane.QUESTION_MESSAGE));
            objeto3.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da conta especial: ", "Número da Conta especial", JOptionPane.QUESTION_MESSAGE)));
            objeto3.setSaldo(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o saldo de conta especial (R$):", "Saldo Conta especial", JOptionPane.QUESTION_MESSAGE)));
            objeto3.limite = (Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o limite da Conta especial (R$):", "Limite do titular da conta especial", JOptionPane.QUESTION_MESSAGE)));
            reajuste = (Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a multa para conta especial (%): :", "Multa da Conta especial", JOptionPane.QUESTION_MESSAGE)));

            if ((objeto1.getNumero() == objeto2.getNumero()) || (objeto1.getNumero() == objeto3.getNumero() || objeto2.getNumero() == objeto3.getNumero()))
            {
                JOptionPane.showOptionDialog(null, "Número das contas iguais! Refaça o processo de cadastro.", "Contas", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op3, op3[0]);
            }

        } while ((objeto1.getNumero() == objeto2.getNumero()) || (objeto1.getNumero() == objeto3.getNumero() || objeto2.getNumero() == objeto3.getNumero()));

        do {
            m = JOptionPane.showOptionDialog(null, "Selecione a opção desejada:", "Contas", JOptionPane.CLOSED_OPTION, JOptionPane.PLAIN_MESSAGE, null, ops, ops[0]);
            if (m == 0) {
                conta1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Número da conta para saque:", "Saque", JOptionPane.QUESTION_MESSAGE));
                saque = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do saque (R$)", "Saque", JOptionPane.QUESTION_MESSAGE));
                if (conta1 == objeto1.getNumero()) {

                    q = JOptionPane.showOptionDialog(null, "Nome do titular da conta:\n" + objeto1.getNome(), "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, ops2, ops2[0]);
                    if (q == 0) {
                        if (saque > 0) {
                            if (objeto1.getSaldo() >= saque) {

                                objeto1.sacar(saque);
                                q = JOptionPane.showOptionDialog(null, "saque efetuado com sucesso!", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op3, op3[0]);

                            } else {

                                JOptionPane.showOptionDialog(null, "Saldo insuficiente!", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, op3, op3[0]);

                            }

                        } else {

                            JOptionPane.showOptionDialog(null, "Saque inválido", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, op3, op3[0]);

                        }
                    } else {

                        JOptionPane.showOptionDialog(null, "Saque cancelado", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, op3, op3[0]);

                    }

                } else if (conta1 == objeto2.getNumero()) {

                    q = JOptionPane.showOptionDialog(null, "Nome do titular da conta:\n" + objeto2.getNome(), "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, ops2, ops2[0]);
                    if (q == 0) {
                        if (saque > 0) {
                            if (objeto2.getSaldo() >= saque) {

                                objeto2.sacar(saque);
                                q = JOptionPane.showOptionDialog(null, "saque efetuado com sucesso!", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op3, op3[0]);

                            } else {

                                JOptionPane.showOptionDialog(null, "Saldo insuficiente!", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, op3, op3[0]);

                            }

                        } else {

                            JOptionPane.showOptionDialog(null, "Saque inválido", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, op3, op3[0]);

                        }
                    } else {

                        JOptionPane.showOptionDialog(null, "Saque cancelado", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, op3, op3[0]);

                    }
                } else if (conta1 == objeto3.getNumero()) {
                    q = JOptionPane.showOptionDialog(null, "Nome do titular da conta:\n" + objeto3.getNome(), "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, ops2, ops2[0]);
                    if (q == 0) {
                        if (saque > 0) {
                            if (objeto3.getSaldo() >= saque) {

                                objeto3.sacar(saque);
                                q = JOptionPane.showOptionDialog(null, "saque efetuado com sucesso!", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op3, op3);

                            } else if (objeto3.getSaldo() + objeto3.limite > saque) {
                                objeto3.sacar(saque);
                                objeto3.descontar(reajuste);
                                q = JOptionPane.showOptionDialog(null, "saque efetuado usando cheque especial!", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op3, op3);

                            } else {

                                JOptionPane.showOptionDialog(null, "Saldo insuficiente!", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, op3, op3[0]);

                            }

                        } else {

                            JOptionPane.showOptionDialog(null, "Saque invàlido", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, op3, op3[0]);

                        }
                    } else {

                        JOptionPane.showOptionDialog(null, "Saque cancelado", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, op3, op3[0]);

                    }

                } else {
                    JOptionPane.showOptionDialog(null, "Número da conta inexistente", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, op3, op3[0]);

                }

            }

            if (m == 1) {
                conta1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero da conta para deposito", " Depósito", JOptionPane.QUESTION_MESSAGE));
                deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do deposito(R$)", "Depósito", JOptionPane.QUESTION_MESSAGE));
                if (conta1 == objeto1.getNumero()) {
                    q = JOptionPane.showOptionDialog(null, "Nome do titular da conta:\n" + objeto1.getNome(), "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, ops2, ops2[0]);

                    if (q == 0) {

                        if (deposito > 0) {
                            objeto1.saldo = objeto1.depositar(deposito);
                            JOptionPane.showOptionDialog(null, "Depósito efetuado com sucesso! ", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op3, op3[0]);

                        } else {
                            JOptionPane.showOptionDialog(null, "Depósito inválido! ", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, op3, op3[0]);

                        }

                    } else {
                        JOptionPane.showOptionDialog(null, "Depósito cancelado\n! ", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, op3, op3[0]);

                    }

                } else if (conta1 == objeto2.getNumero()) {
                    q = JOptionPane.showOptionDialog(null, "Nome do titular da conta:\n" + objeto1.getNome(), "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, ops2, ops2[0]);

                    if (q == 0) {

                        if (deposito > 0) {
                            objeto2.saldo = objeto2.depositar(deposito);
                            JOptionPane.showOptionDialog(null, "Depósito efetuado com sucesso! ", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op3, op3[0]);

                        } else {
                            JOptionPane.showOptionDialog(null, "Depósito inválido! ", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, op3, op3[0]);

                        }

                    } else {
                        JOptionPane.showOptionDialog(null, "Depósito cancelado\n! ", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, op3, op3[0]);

                    }

                } else if (conta1 == objeto3.getNumero()) {
                    q = JOptionPane.showOptionDialog(null, "Nome do titular da conta:\n" + objeto1.getNome(), "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, ops2, ops2[0]);

                    if (q == 0) {

                        if (deposito > 0) {
                            objeto3.saldo = objeto3.depositar(deposito);
                            JOptionPane.showOptionDialog(null, "Depósito efetuado com sucesso! ", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op3, op3[0]);

                        } else {
                            JOptionPane.showOptionDialog(null, "Depósito inválido! ", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, op3, op3[0]);

                        }

                    } else {
                        JOptionPane.showOptionDialog(null, "Depósito cancelado\n! ", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, op3, op3[0]);

                    }

                } else {
                    JOptionPane.showOptionDialog(null, "Número da conta inexistente!", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, op3, op3[0]);
                }

            }
            if (m == 2) {
                conta2 = Integer.parseInt(JOptionPane.showInputDialog(null, " Número da conta que irá transferir: ", " Transferência ", JOptionPane.QUESTION_MESSAGE));
                conta3 = Integer.parseInt(JOptionPane.showInputDialog(null, " Número da conta que irá receber : ", " Transferência ", JOptionPane.QUESTION_MESSAGE));
                if ((conta2 == objeto1.getNumero() || conta2 == objeto2.getNumero() || conta2 == objeto3.getNumero()) && (conta3 == objeto1.getNumero() || conta3 == objeto2.getNumero() || conta3 == objeto3.getNumero())) {
                    if ((conta2 == objeto1.getNumero()) && (conta3 == objeto2.getNumero())) {
                        aux = Double.parseDouble(JOptionPane.showInputDialog(null, " Transferência (R$): ", " Transferência ", JOptionPane.QUESTION_MESSAGE));
                        q = JOptionPane.showOptionDialog(null, "Nome dos titulares da conta:\n " + objeto1.getNome() + "\n" + objeto2.getNome(), "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, ops2, ops2[0]);
                        if (q == 0) {
                            if (aux > 0 && aux <= objeto1.saldo) {
                                objeto1.saldo = objeto1.saldo - aux;
                                objeto2.saldo = objeto2.saldo + aux;
                                JOptionPane.showOptionDialog(null, "Transferência efetuada com sucesso!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op3, op3[0]);
                            } else {
                                JOptionPane.showOptionDialog(null, "transferência invalida ou valor excedeo saldo da conta de " + objeto1.getNome() + ", N°" + objeto1.getNumero() + "!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op3, op3[0]);
                            }
                        } else {
                            JOptionPane.showOptionDialog(null, "Transferência cancelada!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, op3, op3[0]);
                        }

                    }
                    if ((conta2 == objeto1.getNumero()) && (conta3 == objeto3.getNumero())) {
                        aux = Double.parseDouble(JOptionPane.showInputDialog(null, " Transferência (R$): ", " Transferência ", JOptionPane.QUESTION_MESSAGE));
                        q = JOptionPane.showOptionDialog(null, "Nome dos titulares da conta:\n " + objeto1.getNome() + "\n" + objeto3.getNome(), "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, ops2, ops2[0]);

                        if (q == 0) {
                            if (aux > 0 && aux <= objeto1.saldo) {
                                objeto1.saldo = objeto1.saldo - aux;
                                objeto3.saldo = objeto3.saldo + aux;
                                JOptionPane.showOptionDialog(null, "Transferência efetuada com sucesso!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op3, op3[0]);

                            } else {
                                JOptionPane.showOptionDialog(null, "transferência invalida ou valor excede saldo da conta de " + objeto1.getNome() + ", N°" + objeto1.getNumero() + "!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op3, op3[0]);

                            }
                        } else {
                            JOptionPane.showOptionDialog(null, "Transferência cancelada!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, op3, op3[0]);

                        }
                    }
                    if ((conta2 == objeto2.getNumero()) && (conta3 == objeto1.getNumero())) {

                        aux = Double.parseDouble(JOptionPane.showInputDialog(null, " Transferência(R$): ", " Transferência ", JOptionPane.QUESTION_MESSAGE));
                        q = JOptionPane.showOptionDialog(null, "Nome dos titulares das conta:\n " + objeto2.getNome() + "\n" + objeto1.getNome(), "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, ops2, ops2[0]);
                        if (q == 0) {
                            if (aux > 0 && aux <= objeto2.saldo) {
                                objeto2.saldo = objeto2.saldo - aux;
                                objeto1.saldo = objeto1.saldo + aux;
                                JOptionPane.showOptionDialog(null, "Transferência efetuada com sucesso!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op3, op3[0]);

                            } else {
                                JOptionPane.showOptionDialog(null, "transferência invalida ou valor excede saldo da conta de " + objeto2.getNome() + ", N°" + objeto2.getNumero() + "!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op3, op3[0]);

                            }
                        } else {
                            JOptionPane.showOptionDialog(null, "Transferência cancelada!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, op3, op3[0]);

                        }
                    }
                    if ((conta2 == objeto2.getNumero()) && (conta3 == objeto3.getNumero())) {
                        aux = Double.parseDouble(JOptionPane.showInputDialog(null, " Transferência (R$): ", " Transferência ", JOptionPane.QUESTION_MESSAGE));
                        q = JOptionPane.showOptionDialog(null, "Nome dos titulares das conta:\n " + objeto2.getNome() + "\n" + objeto3.getNome(), "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, ops2, ops2[0]);

                        if (q == 0) {
                            if (aux > 0 && aux <= objeto2.saldo) {
                                objeto2.saldo = objeto2.saldo - aux;
                                objeto3.saldo = objeto3.saldo + aux;
                                JOptionPane.showOptionDialog(null, "Transferência efetuada com sucesso!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op3, op3[0]);

                            } else {
                                JOptionPane.showOptionDialog(null, "transferência invalida ou valor excede saldo da conta de " + objeto2.getNome() + ", N°" + objeto2.getNumero() + "!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op3, op3[0]);

                            }
                        } else {
                            JOptionPane.showOptionDialog(null, "Transferência cancelada!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, op3, op3[0]);

                        }
                    }
                    if ((conta2 == objeto3.getNumero()) && (conta3 == objeto1.getNumero())) {
                        aux = Double.parseDouble(JOptionPane.showInputDialog(null, " Transferência (R$): ", " Transferência ", JOptionPane.QUESTION_MESSAGE));
                        q = JOptionPane.showOptionDialog(null, "Nome dos titulares das conta:\n " + objeto3.getNome() + "\n" + objeto1.getNome(), "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, ops2, ops2[0]);

                        if (q == 0) {
                            if (aux > 0 && aux <= objeto3.saldo) {
                                objeto3.saldo = objeto3.saldo - aux;
                                objeto1.saldo = objeto1.saldo + aux;
                                JOptionPane.showOptionDialog(null, "Transferência efetuada com sucesso!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op3, op3[0]);

                            } else {
                                JOptionPane.showOptionDialog(null, "transferência invalida ou valor excede saldo da conta de " + objeto3.getNome() + ", N°" + objeto3.getNumero() + "!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op3, op3[0]);

                            }
                        } else {
                            JOptionPane.showOptionDialog(null, "Transferência cancelada!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, op3, op3[0]);

                        }
                    }
                    if ((conta2 == objeto3.getNumero()) && (conta3 == objeto2.getNumero())) {
                        aux = Double.parseDouble(JOptionPane.showInputDialog(null, " Transferência de valor (R $): ", " Transferência ", JOptionPane.QUESTION_MESSAGE));
                        q = JOptionPane.showOptionDialog(null, "Nome dos titulares das conta:\n " + objeto3.getNome() + "\n" + objeto2.getNome(), "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, ops2, ops2[0]);

                        if (q == 0) {
                            if (aux > 0 && aux <= objeto3.saldo) {
                                objeto3.saldo = objeto3.saldo - aux;
                                objeto2.saldo = objeto2.saldo + aux;
                                JOptionPane.showOptionDialog(null, "Transferência efetuada com sucesso!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op3, op3[0]);

                            } else {
                                JOptionPane.showOptionDialog(null, "transferência invalida ou valor excede saldo da conta de " + objeto3.getNome() + ", N°" + objeto3.getNumero() + "!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op3, op3[0]);

                            }
                        } else {
                            JOptionPane.showOptionDialog(null, "Transferência cancelada!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, op3, op3[0]);

                        }
                    }
                } else if (conta2 == conta3) {
                    JOptionPane.showOptionDialog(null, "Numeros das contas iguais!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, op3, op3[0]);

                } else {
                    JOptionPane.showOptionDialog(null, "Numeros das contas diferente dos do cadastro!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, op3, op3[0]);

                }
            }

            if (m == 3) {
                try {
                    transferencia = Double.parseDouble(JOptionPane.showInputDialog(null, " Taxa de conversão para a conta poupança(%): ", " Lucro da Conta Poupança ", JOptionPane.QUESTION_MESSAGE));
                    objeto2.saldo = objeto2.reajustar(transferencia);
                    JOptionPane.showOptionDialog(null, "Reajuste realizado com sucesso!\n", "Reajuste", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op3, op3[0]);

                } catch (NumberFormatException s) {
                    objeto2.saldo = objeto2.reajustar();
                    JOptionPane.showOptionDialog(null, "Reajuste realizado com sucesso!\n", "Reajuste", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op3, op3[0]);

                }
            }
            if (m == 4) {
                JOptionPane.showMessageDialog(null, "Saldo " + objeto1.tipoConta() + "," + objeto1.getNome() + ", N°" + objeto1.getNumero() + ":\n " + objeto1.saldo + " Reais\n Saldo " + objeto2.tipoConta() + "," + objeto2.getNome() + ", N°" + objeto2.getNumero() + ":\n " + objeto2.saldo + " Reais\n Saldo " + objeto3.tipoConta() + "," + objeto3.getNome() + ", N°" + objeto3.getNumero() + ":\n " + objeto3.saldo + " Reais");

            }
            if (m == 5) {
                System.exit(0);
            }
            q = 1;
        } while (q != 0);
    }
}