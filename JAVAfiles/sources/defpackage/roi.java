package defpackage;

import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class roi implements Supplier {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    public /* synthetic */ roi(int i) {
        this.b = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.b) {
            case 0:
                throw null;
            case 1:
                return new rnz();
            case 2:
                throw null;
            case 3:
                return roq.c.d;
            case 4:
                aozy createBuilder = amhu.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amhu amhuVar = (amhu) createBuilder.b;
                amhuVar.f = 1;
                amhuVar.b |= 16;
                return (amhu) createBuilder.s();
            case 5:
                return new ArrayList();
            case 6:
                return new ArrayList();
            case 7:
                return new rsz();
            case 8:
                return a.bz();
            case 9:
                return new ArrayList();
            case 10:
                return new ArrayList();
            case 11:
                throw null;
            case 12:
                return new ArrayList();
            case 13:
                return new HashMap();
            case 14:
                return new ArrayList();
            case 15:
                return new ArrayList();
            case 16:
                return Stream.CC.empty();
            case 17:
                return new ArrayList();
            case 18:
                return new ArrayList();
            case 19:
                return new ArrayList();
            default:
                throw null;
        }
    }
}
