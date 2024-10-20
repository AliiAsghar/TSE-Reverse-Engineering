package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qxs implements Supplier {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    public /* synthetic */ qxs(int i) {
        this.b = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.b) {
            case 0:
                return new qxt();
            case 1:
                return new ArrayList();
            case 2:
                return new HashMap();
            case 3:
                throw null;
            case 4:
                return new ArrayList();
            case 5:
                return new IllegalStateException("Rcs identifier of remote user doesn't exist.");
            case 6:
                ((alwl) rat.b.i()).q("SelfIdentityChatEndpoint not present on the message");
                aozy createBuilder = amhu.a.createBuilder();
                createBuilder.getClass();
                apag s = createBuilder.s();
                s.getClass();
                return (amhu) s;
            case 7:
                return new ArrayList();
            case 8:
                return new to();
            case 9:
                return new ArrayList();
            case 10:
                return a.bz();
            case 11:
                throw null;
            case 12:
                return new ArrayList();
            case 13:
                return new ArrayList();
            case 14:
                return new ArrayList();
            case 15:
                throw null;
            case 16:
                return rlk.e.u;
            case 17:
                return rpb.e.j;
            case 18:
                throw null;
            case 19:
                return rlk.e.u;
            default:
                throw null;
        }
    }
}
