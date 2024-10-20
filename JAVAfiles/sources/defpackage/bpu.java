package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpu {
    public static final bpu a;
    public static final bpu b;
    private static final /* synthetic */ bpu[] c;

    static {
        bpu bpuVar = new bpu("THUMB", 0);
        a = bpuVar;
        bpu bpuVar2 = new bpu("TRACK", 1);
        b = bpuVar2;
        bpu[] bpuVarArr = {bpuVar, bpuVar2};
        c = bpuVarArr;
        arhi.f(bpuVarArr);
    }

    private bpu(String str, int i) {
    }

    public static bpu[] values() {
        return (bpu[]) c.clone();
    }
}
