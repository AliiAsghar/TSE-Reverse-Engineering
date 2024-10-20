package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aodj implements aoep {
    private final /* synthetic */ int i;
    public static final aodj h = new aodj(7);
    public static final aodj g = new aodj(6);
    public static final aodj f = new aodj(5);
    public static final aodj e = new aodj(4);
    public static final aodj d = new aodj(3);
    public static final aodj c = new aodj(2);
    public static final aodj b = new aodj(1);
    public static final aodj a = new aodj(0);

    public aodj(int i) {
        this.i = i;
    }

    @Override // defpackage.aoep
    public final /* synthetic */ Object a(aoeo aoeoVar) {
        switch (this.i) {
            case 0:
                Object d2 = aoeoVar.d(new aofg(aods.class, Executor.class));
                d2.getClass();
                return arsd.an((Executor) d2);
            case 1:
                Object d3 = aoeoVar.d(new aofg(aodq.class, Executor.class));
                d3.getClass();
                return arsd.an((Executor) d3);
            case 2:
                Object d4 = aoeoVar.d(new aofg(aodr.class, Executor.class));
                d4.getClass();
                return arsd.an((Executor) d4);
            case 3:
                Object d5 = aoeoVar.d(new aofg(aodt.class, Executor.class));
                d5.getClass();
                return arsd.an((Executor) d5);
            case 4:
                Object d6 = aoeoVar.d(new aofg(aodq.class, Executor.class));
                d6.getClass();
                return arsd.an((Executor) d6);
            case 5:
                Object d7 = aoeoVar.d(new aofg(aods.class, Executor.class));
                d7.getClass();
                return arsd.an((Executor) d7);
            case 6:
                Object d8 = aoeoVar.d(new aofg(aodr.class, Executor.class));
                d8.getClass();
                return arsd.an((Executor) d8);
            default:
                Object d9 = aoeoVar.d(new aofg(aodt.class, Executor.class));
                d9.getClass();
                return arsd.an((Executor) d9);
        }
    }
}
