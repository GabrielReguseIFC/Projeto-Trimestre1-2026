/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class StatusTreinamento {

    int PLANEJADO = 1;
    int EM_ANDAMENTO = 2;
    int CONCLUIDO = 3;
    int CANCELADO = 4;

    private final int codigo;

    StatusTreinamento(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
