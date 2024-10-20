package defpackage;

import com.google.android.apps.messaging.conversation.simpicker.SimPickerView;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jar implements zqe {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation/simpicker/SimPickerFragmentPeer");
    public final ConversationIdType b;
    public final jao c;
    public final ryg d;
    public final aksr e;
    public boolean g;
    public final armf i;
    public SimPickerView k;
    public rtj l;
    public final armf m;
    public final armf n;
    public final eoy p;
    public final uie q;
    public final aohs r;
    public String f = null;
    public final xze h = xze.g("Bugle", "SimPickerFragmentPeer");
    public boolean j = false;
    private boolean s = false;
    public int o = 1;

    public jar(String str, eoy eoyVar, jao jaoVar, ryg rygVar, uie uieVar, armf armfVar, armf armfVar2, armf armfVar3, aohs aohsVar, aksr aksrVar) {
        this.i = armfVar3;
        this.b = ruy.b(str);
        this.p = eoyVar;
        this.c = jaoVar;
        this.d = rygVar;
        this.q = uieVar;
        this.l = uieVar.r();
        this.m = armfVar;
        this.n = armfVar2;
        this.r = aohsVar;
        this.e = aksrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(rtj rtjVar) {
        jaw E = this.k.E();
        jas jasVar = E.a;
        jasVar.c = rtjVar.b;
        jasVar.p();
        E.c.ifPresent(new ixe(3));
        boolean z = true;
        if (rtjVar.b.isEmpty() && rtjVar.c == null) {
            z = false;
        }
        this.g = z;
        if (this.j && z) {
            this.k.E();
            wsm.a();
            b(this.s);
            this.j = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(boolean r25) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jar.b(boolean):void");
    }

    public final void c() {
        int i = this.o;
        if (i != 1 && i != 4) {
            this.k.E().a(true, new ivl(this, 10));
            this.o = 4;
        }
    }

    @Override // defpackage.zqe
    public final boolean n() {
        throw null;
    }
}
