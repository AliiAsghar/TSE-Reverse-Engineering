package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uzg implements Supplier {
    private final /* synthetic */ int a;

    public /* synthetic */ uzg(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return (amfx) amfy.a.createBuilder();
            case 1:
                return new ArrayList();
            case 2:
                return new ArrayList();
            case 3:
                return new vdu();
            case 4:
                return new vdy();
            case 5:
                return new vea();
            case 6:
                return new vdu();
            case 7:
                return new vef();
            case 8:
                return new ArrayList();
            case 9:
                return new HashSet();
            case 10:
                return new HashSet();
            case 11:
                return new ArrayList();
            case 12:
                return new HashSet();
            case 13:
                return new ArrayList();
            case 14:
                return new ArrayList();
            case 15:
                return new ArrayList();
            case 16:
                return new HashSet();
            case 17:
                return new HashSet();
            case 18:
                return new HashMap();
            case 19:
                return new vpr();
            default:
                return new IllegalStateException("senderMessagingIdentity expected");
        }
    }
}
