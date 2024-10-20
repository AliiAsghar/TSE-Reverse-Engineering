package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjp {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public kjp() {
        this.b = new HashMap();
        this.e = new HashMap();
        this.c = new LinkedHashSet();
        this.d = ascy.a(0);
        this.a = ascy.a(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final aesg a(int i, aerb aerbVar) {
        aete aeteVar;
        if (((pdr) this.d.b()).a()) {
            String string = ((Context) this.e).getString(i);
            string.getClass();
            return new aesr(string, aerbVar, null, false, 60);
        }
        if (aerbVar != null) {
            aeteVar = new aete(aerbVar);
        } else {
            aeteVar = null;
        }
        String string2 = ((Context) this.e).getString(i);
        string2.getClass();
        return new aeth(string2, null, null, null, aeteVar, kek.d, 94);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    public final nen b(msh mshVar) {
        arwe arweVar = (arwe) this.d.b();
        arweVar.getClass();
        arwe arweVar2 = (arwe) this.e.b();
        arweVar2.getClass();
        wfh wfhVar = (wfh) this.c.b();
        wfhVar.getClass();
        iew iewVar = (iew) this.b.b();
        iewVar.getClass();
        mshVar.getClass();
        return new nen(arweVar, arweVar2, wfhVar, iewVar, this.a, mshVar, 0);
    }

    public final Optional c(mll mllVar, nfw nfwVar) {
        Optional map = Optional.ofNullable(mllVar.z()).map(new mvp(new kjs(this, nfwVar, 9), 14));
        map.getClass();
        return map;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [armf, java.lang.Object] */
    public final /* synthetic */ mja d(Optional optional, armf armfVar, armf armfVar2) {
        Optional optional2 = (Optional) ((apxx) this.c).a;
        anen anenVar = (anen) this.d.b();
        anenVar.getClass();
        return new nbq(this.b, this.e, optional2, this.a, anenVar, optional, armfVar, armfVar2);
    }

    public kjp(aajq aajqVar, Context context, lre lreVar, khs khsVar, armf armfVar) {
        aajqVar.getClass();
        context.getClass();
        lreVar.getClass();
        armfVar.getClass();
        this.a = aajqVar;
        this.e = context;
        this.c = lreVar;
        this.b = khsVar;
        this.d = armfVar;
    }

    public kjp(arwe arweVar, arwe arweVar2, armf armfVar, yyb yybVar, khj khjVar, jxv jxvVar, Optional optional) {
        arweVar.getClass();
        arweVar2.getClass();
        armfVar.getClass();
        yybVar.getClass();
        khjVar.getClass();
        this.a = arweVar2;
        this.b = armfVar;
        this.d = khjVar;
        this.e = jxvVar;
        this.c = (afqj) arsd.k(optional);
    }

    public kjp(kkg kkgVar, kkc kkcVar, kkc kkcVar2, kjp kjpVar, mgu mguVar, ConversationId conversationId) {
        kjpVar.getClass();
        conversationId.getClass();
        this.a = kkgVar;
        this.b = kkcVar;
        this.c = kkcVar2;
        this.d = kjpVar;
        this.e = mguVar;
    }

    public kjp(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, char[] cArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.e = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.a = armfVar4;
        armfVar5.getClass();
        this.d = armfVar5;
    }

    public kjp(xyt xytVar, xnv xnvVar, vqu vquVar, armf armfVar, psz pszVar, arwe arweVar) {
        xytVar.getClass();
        xnvVar.getClass();
        vquVar.getClass();
        armfVar.getClass();
        pszVar.getClass();
        arweVar.getClass();
        this.c = xnvVar;
        this.b = vquVar;
        this.a = armfVar;
        this.d = pszVar;
        this.e = arweVar;
    }

    public kjp(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, byte[] bArr) {
        armfVar.getClass();
        this.d = armfVar;
        armfVar2.getClass();
        this.e = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.b = armfVar4;
        armfVar5.getClass();
        this.a = armfVar5;
    }

    public kjp(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        armfVar.getClass();
        this.e = armfVar;
        armfVar2.getClass();
        this.d = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.a = armfVar4;
        armfVar5.getClass();
        this.b = armfVar5;
    }
}
