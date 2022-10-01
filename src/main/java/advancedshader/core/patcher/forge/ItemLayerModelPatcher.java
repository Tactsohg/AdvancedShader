package advancedshader.core.patcher.forge;

import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.MethodNode;

import advancedshader.core.patcher.Patcher;
import advancedshader.core.patcher.Patcher.Patch;

@Patch("net.minecraftforge.client.model.ItemLayerModel")
public class ItemLayerModelPatcher extends Patcher {

    @MethodPatch("buildSideQuad(Lcea;Ljava/util/Optional;Lfa;ILcdq;III)Lbvp;")
    public void buildSideQuad(MethodNode method) {
        LabelNode label1 = ByteCode.Label();
        LabelNode label2 = ByteCode.Label();
        LabelNode label3 = ByteCode.Label();
        LabelNode label4 = ByteCode.Label();
        LabelNode label5 = ByteCode.Label();
        LabelNode label6 = ByteCode.Label();
        LabelNode label7 = ByteCode.Label();
        LabelNode label8 = ByteCode.Label();
        LabelNode label9 = ByteCode.Label();
        LabelNode label10 = ByteCode.Label();

        patch("修复物品侧面UV", method,
                ByteCode.Label(),
                ByteCode.LineNumber(),
                ByteCode.Frame(),
                ByteCode.ALoad(2),
                ByteCode.InvokeVirtual("fa", "n", "()Lfq;"),
                ByteCode.InvokeVirtual("fq", "p", "()I"),
                ByteCode.I2F(),
                remove(ByteCode.Ldc(0.01F)),
                remove(ByteCode.FMul()),
                ByteCode.ILoad(9),
                ByteCode.I2F(),
                ByteCode.FDiv(),
                ByteCode.FStore(17),
                ByteCode.Label(),
                ByteCode.LineNumber(),
                ByteCode.ALoad(2),
                ByteCode.InvokeVirtual("fa", "n", "()Lfq;"),
                ByteCode.InvokeVirtual("fq", "q", "()I"),
                ByteCode.I2F(),
                remove(ByteCode.Ldc(0.01F)),
                remove(ByteCode.FMul()),
                ByteCode.ILoad(10),
                ByteCode.I2F(),
                ByteCode.FDiv(),
                ByteCode.FStore(18),
                ByteCode.Label(),
                ByteCode.LineNumber(),
                ByteCode.Ldc(16.0F),
                ByteCode.FLoad(11),
                ByteCode.FLoad(17),
                ByteCode.FSub(),
                ByteCode.FMul(),
                ByteCode.FStore(19),
                ByteCode.Label(),
                ByteCode.LineNumber(),
                ByteCode.Ldc(16.0F),
                ByteCode.FLoad(13),
                inject(ByteCode.ALoad(2)),
                inject(ByteCode.InvokeVirtual("fa", "k", "()Lfa$a;")),
                inject(ByteCode.GetStatic("fa$a", "X", "Lfa$a;")),
                inject(ByteCode.IfObjNotEqual(label1)),
                inject(ByteCode.Ldc(0.0625F)),
                inject(ByteCode.FAdd()),
                inject(label1),
                ByteCode.FLoad(17),
                ByteCode.FSub(),
                ByteCode.FMul(),
                ByteCode.FStore(20),
                ByteCode.Label(),
                ByteCode.LineNumber(),
                ByteCode.Ldc(16.0F),
                ByteCode.FConst(1),
                ByteCode.FLoad(12),
                ByteCode.FSub(),
                ByteCode.FLoad(18),
                ByteCode.FSub(),
                ByteCode.FMul(),
                ByteCode.FStore(21),
                ByteCode.Label(),
                ByteCode.LineNumber(),
                ByteCode.Ldc(16.0F),
                ByteCode.FConst(1),
                ByteCode.FLoad(14),
                inject(ByteCode.ALoad(2)),
                inject(ByteCode.InvokeVirtual("fa", "k", "()Lfa$a;")),
                inject(ByteCode.GetStatic("fa$a", "Y", "Lfa$a;")),
                inject(ByteCode.IfObjNotEqual(label2)),
                inject(ByteCode.Ldc(0.0625F)),
                inject(ByteCode.FSub()),
                inject(label2),
                ByteCode.FSub(),
                ByteCode.FLoad(18),
                ByteCode.FSub(),
                ByteCode.FMul(),
                ByteCode.FStore(22),
                ByteCode.Label(),
                ByteCode.LineNumber(),
                ByteCode.ALoad(0),
                ByteCode.ALoad(1),
                ByteCode.ALoad(2),
                ByteCode.Label(),
                ByteCode.LineNumber(),
                ByteCode.InvokeStatic("net/minecraftforge/client/model/ItemLayerModel", "remap", "(Lfa;)Lfa;"),
                ByteCode.ALoad(4),
                ByteCode.ILoad(3),
                ByteCode.FLoad(11),
                ByteCode.FLoad(12),
                ByteCode.FLoad(15),
                ByteCode.ALoad(4),
                ByteCode.FLoad(19),
                ByteCode.F2D(),
                ByteCode.Label(),
                ByteCode.LineNumber(),
                ByteCode.InvokeVirtual("cdq", "a", "(D)F"),
                ByteCode.ALoad(4),
                ByteCode.FLoad(21),
                ByteCode.F2D(),
                ByteCode.InvokeVirtual("cdq", "b", "(D)F"),
                ByteCode.FLoad(13),
                ByteCode.FLoad(14),
                ByteCode.FLoad(15),
                ByteCode.ALoad(4),
                inject(ByteCode.ALoad(2)),
                inject(ByteCode.InvokeVirtual("fa", "k", "()Lfa$a;")),
                inject(ByteCode.GetStatic("fa$a", "Y", "Lfa$a;")),
                inject(ByteCode.IfObjNotEqual(label3)),
                ByteCode.FLoad(20),
                inject(ByteCode.Goto(label4)),
                inject(label3),
                inject(ByteCode.FLoad(19)),
                inject(label4),
                ByteCode.F2D(),
                ByteCode.Label(),
                ByteCode.LineNumber(),
                ByteCode.InvokeVirtual("cdq", "a", "(D)F"),
                ByteCode.ALoad(4),
                inject(ByteCode.ALoad(2)),
                inject(ByteCode.InvokeVirtual("fa", "k", "()Lfa$a;")),
                inject(ByteCode.GetStatic("fa$a", "X", "Lfa$a;")),
                inject(ByteCode.IfObjNotEqual(label5)),
                ByteCode.FLoad(22),
                inject(ByteCode.Goto(label6)),
                inject(label5),
                inject(ByteCode.FLoad(21)),
                inject(label6),
                ByteCode.F2D(),
                ByteCode.InvokeVirtual("cdq", "b", "(D)F"),
                ByteCode.FLoad(13),
                ByteCode.FLoad(14),
                ByteCode.FLoad(16),
                ByteCode.ALoad(4),
                ByteCode.FLoad(20),
                ByteCode.F2D(),
                ByteCode.Label(),
                ByteCode.LineNumber(),
                ByteCode.InvokeVirtual("cdq", "a", "(D)F"),
                ByteCode.ALoad(4),
                ByteCode.FLoad(22),
                ByteCode.F2D(),
                ByteCode.InvokeVirtual("cdq", "b", "(D)F"),
                ByteCode.FLoad(11),
                ByteCode.FLoad(12),
                ByteCode.FLoad(16),
                ByteCode.ALoad(4),
                inject(ByteCode.ALoad(2)),
                inject(ByteCode.InvokeVirtual("fa", "k", "()Lfa$a;")),
                inject(ByteCode.GetStatic("fa$a", "Y", "Lfa$a;")),
                inject(ByteCode.IfObjNotEqual(label7)),
                ByteCode.FLoad(19),
                inject(ByteCode.Goto(label8)),
                inject(label7),
                inject(ByteCode.FLoad(20)),
                inject(label8),
                ByteCode.F2D(),
                ByteCode.Label(),
                ByteCode.LineNumber(),
                ByteCode.InvokeVirtual("cdq", "a", "(D)F"),
                ByteCode.ALoad(4),
                inject(ByteCode.ALoad(2)),
                inject(ByteCode.InvokeVirtual("fa", "k", "()Lfa$a;")),
                inject(ByteCode.GetStatic("fa$a", "X", "Lfa$a;")),
                inject(ByteCode.IfObjNotEqual(label9)),
                ByteCode.FLoad(21),
                inject(ByteCode.Goto(label10)),
                inject(label9),
                inject(ByteCode.FLoad(22)),
                inject(label10),
                ByteCode.F2D(),
                ByteCode.InvokeVirtual("cdq", "b", "(D)F"),
                ByteCode.Label(),
                ByteCode.LineNumber(),
                ByteCode.InvokeStatic("net/minecraftforge/client/model/ItemLayerModel", "buildQuad", "(Lcea;Ljava/util/Optional;Lfa;Lcdq;IFFFFFFFFFFFFFFFFFFFF)Lbvp;"));
    }
}