package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tyr implements Supplier {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    public /* synthetic */ tyr(int i) {
        this.b = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.b) {
            case 0:
                return new tys();
            case 1:
                return new IllegalArgumentException("Missing recipient from the headers.");
            case 2:
                return new ArrayList();
            case 3:
                throw null;
            case 4:
                return new ArrayList();
            case 5:
                return new HashSet();
            case 6:
                throw null;
            case 7:
                return new xhv();
            case 8:
                return new ArrayList();
            case 9:
                return new ArrayList();
            case 10:
                return new ArrayList();
            case 11:
                throw null;
            case 12:
                throw null;
            case 13:
                throw null;
            case 14:
                throw null;
            case 15:
                throw null;
            case 16:
                return new uqs();
            case 17:
                return new uqs();
            case 18:
                return new ArrayList();
            case 19:
                return new ArrayList();
            default:
                return new ArrayList();
        }
    }
}
