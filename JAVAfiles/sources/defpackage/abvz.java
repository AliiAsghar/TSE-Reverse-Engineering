package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abvz {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public abvz(Context context, abwb abwbVar, Handler handler, Map map, DroidGuardResultsRequest droidGuardResultsRequest, abwn abwnVar, abwd abwdVar, ahjj ahjjVar) {
        this.a = false;
        this.b = context;
        this.g = abwbVar;
        this.c = handler;
        this.d = map;
        this.e = droidGuardResultsRequest;
        this.h = abwnVar;
        this.f = abwdVar;
        this.i = ahjjVar;
    }

    public final void a(String str) {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            try {
                ((Handler) this.c).post(new aanh(this, str, 20));
            } catch (RuntimeException unused) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [armf, java.lang.Object] */
    public final void b(yym yymVar) {
        if (this.a && yymVar.d && !yymVar.f && !yymVar.e && !yymVar.h) {
            if (((Boolean) ((utz) ymd.j.get()).e()).booleanValue()) {
                wyp wypVar = (wyp) this.f.b();
                MessageId messageId = yymVar.b;
                String str = yymVar.c;
                if (messageId instanceof mvb) {
                    MessageIdType c = ((mvb) messageId).c();
                    c.getClass();
                    wypVar.H(c, str);
                } else {
                    throw new IllegalArgumentException("MAPI MessageID is not yet natively supported in spam.");
                }
            }
            if (((Boolean) ((utz) ymd.k.get()).e()).booleanValue()) {
                ((lre) this.e.b()).e(true, new wup(this, yymVar, 9, null));
                return;
            } else {
                yymVar.a.a();
                return;
            }
        }
        yymVar.a.a();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [arpi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [arwe, java.lang.Object] */
    public final void c(int i) {
        qjh.l(this.d, this.h, new jmk(this, i, (arpe) null, 16), 2);
    }

    public abvz(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, ajwt ajwtVar, armf armfVar6, arwe arweVar, arpi arpiVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        ajwtVar.getClass();
        armfVar6.getClass();
        arweVar.getClass();
        arpiVar.getClass();
        this.b = armfVar;
        this.f = armfVar2;
        this.i = armfVar3;
        this.g = armfVar4;
        this.e = armfVar5;
        this.c = armfVar6;
        this.d = arweVar;
        this.h = arpiVar;
        qjh.l(arweVar, arpiVar, new yyn(this, null), 2);
    }
}
