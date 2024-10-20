package defpackage;

import java.util.LinkedHashMap;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akxz implements Supplier {
    private final /* synthetic */ int a;

    public /* synthetic */ akxz(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new alam((byte[]) null, 2, (char[]) null);
            case 1:
                return new alam((byte[]) null, 1, (byte[]) null);
            case 2:
                return new akzw();
            case 3:
                return new alam(null, 0);
            case 4:
                return new alag(null, 0);
            case 5:
                return new akzx();
            case 6:
                return new alag((byte[]) null, 2, (char[]) null);
            case 7:
                return new alaj(null);
            case 8:
                return new akzr(null);
            case 9:
                return new alag((byte[]) null, 1, (byte[]) null);
            case 10:
                return new akxo() { // from class: akyq
                    @Override // defpackage.akxo
                    public final Object a() {
                        return new Object();
                    }
                };
            case 11:
                return new akyv();
            case 12:
                return new alob();
            case 13:
                return new alpr();
            case 14:
                return new ahlp((byte[]) null, (char[]) null);
            case 15:
                return new alok();
            case 16:
                return new LinkedHashMap();
            default:
                return ((anfh) aovp.m(anfi.b(), anfh.class)).hY();
        }
    }
}
