package defpackage;

import android.text.TextUtils;
import com.google.communication.synapse.security.scytale.Scope;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class twn extends unp {
    public static final xze a = xze.g("BugleEtouffee", "EncryptedMessageDeletionWorkHandler");
    public final armf b;
    private final armf c;
    private final armf d;
    private final apwt e;
    private final armf f;
    private final arwe g;

    public twn(armf armfVar, armf armfVar2, armf armfVar3, apwt apwtVar, armf armfVar4, arwe arweVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        apwtVar.getClass();
        armfVar4.getClass();
        arweVar.getClass();
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = apwtVar;
        this.f = armfVar4;
        this.g = arweVar;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("EncryptedMessageDeletionWorkHandler");
    }

    @Override // defpackage.unp
    public final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        akul c;
        akul c2;
        twm twmVar = (twm) apbtVar;
        twmVar.getClass();
        if (((okg) this.f.b()).a()) {
            this.e.b();
            c2 = qjh.c(this.g, arpj.a, arwf.a, new hmp(twmVar, this, Scope.create(((uac) this.d.b()).b()), (arpe) null, 3));
            return c2;
        }
        Optional e = ((vbu) this.c.b()).e();
        if (!e.isEmpty() && !TextUtils.isEmpty(((qei) e.get()).d)) {
            String str = ((qei) e.get()).d;
            str.getClass();
            this.e.b();
            c = qjh.c(this.g, arpj.a, arwf.a, new hak(this, str, twmVar, Scope.create(((uac) this.d.b()).b()), (arpe) null, 20));
            return c;
        }
        akul af = aktp.af(new IllegalStateException("No self RCS MSISDN is available."));
        af.getClass();
        return af;
    }

    @Override // defpackage.unx
    public final apca e() {
        apca parserForType = twm.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }
}
