package defpackage;

import android.os.Bundle;
import androidx.preference.Preference;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.mediapicker.c2o.contact.VCardContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.file.FileContentItem;
import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsh extends arrp implements arqr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsh(Object obj, int i) {
        super(1);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v55, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r8v56, types: [java.lang.Object, afxy] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        int i = 2;
        switch (this.b) {
            case 0:
                Object obj2 = ((Object[]) this.a)[((Number) obj).intValue()];
                if (obj2 != null) {
                    return (String) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            case 1:
                Object obj3 = ((Object[]) this.a)[((Number) obj).intValue()];
                if (obj3 != null) {
                    return (Integer) obj3;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            case 2:
                return Boolean.valueOf(((hdr) this.a).m(Integer.MAX_VALUE, ((Number) obj).longValue()));
            case 3:
                ((hif) obj).getClass();
                return this.a;
            case 4:
                dho dhoVar = (dho) obj;
                dhoVar.getClass();
                dhn dhnVar = hmh.b;
                artm artmVar = hmh.a[0];
                dhnVar.a(dhoVar, ((hmi) this.a).c);
                return arnb.a;
            case 5:
                cvc.a aVar = (cvc.a) obj;
                aVar.getClass();
                aVar.e((cvc) this.a, 0, 0, brg.a);
                return arnb.a;
            case 6:
                Preference preference = (Preference) obj;
                preference.getClass();
                ((gfl) this.a).d().af(preference);
                return arnb.a;
            case 7:
                ((ids) obj).getClass();
                return this.a;
            case 8:
                this.a.get(((Number) obj).intValue());
                return null;
            case 9:
                long j = ((cjn) obj).a;
                Object e = igx.g.e();
                e.getClass();
                ((igl) this.a).f.b(new lmo((String) e, null, 2));
                return true;
            case 10:
                long j2 = ((cjn) obj).a;
                Object e2 = igx.c.e();
                e2.getClass();
                ((igm) this.a).d.b(new lmo((String) e2, null, 2));
                return true;
            case 11:
                long j3 = ((cjn) obj).a;
                Object e3 = igx.g.e();
                e3.getClass();
                ((igo) this.a).f.b(new lmo((String) e3, null, 2));
                return true;
            case 12:
                ahlp ahlpVar = (ahlp) obj;
                ahlpVar.getClass();
                Object obj4 = ahlpVar.a;
                aozy aozyVar = (aozy) obj4;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                Object obj5 = this.a;
                amqn amqnVar = (amqn) ((amqm) obj4).b;
                amqn amqnVar2 = amqn.a;
                amqnVar.c = obj5;
                amqnVar.b = 3;
                return arnb.a;
            case 13:
                ahlp ahlpVar2 = (ahlp) obj;
                ahlpVar2.getClass();
                Object obj6 = ahlpVar2.a;
                aozy aozyVar2 = (aozy) obj6;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                Object obj7 = this.a;
                amqn amqnVar3 = (amqn) ((amqm) obj6).b;
                amqn amqnVar4 = amqn.a;
                amqnVar3.c = obj7;
                amqnVar3.b = 5;
                return arnb.a;
            case 14:
                inf infVar = (inf) obj;
                infVar.getClass();
                return ((ifb) this.a).d(infVar, (aauj) iov.a.a());
            case 15:
                VCardContentItem vCardContentItem = (VCardContentItem) obj;
                vCardContentItem.getClass();
                MessagePartCoreData e4 = ((ifb) this.a).e(vCardContentItem, (aauj) iox.a.a());
                e4.getClass();
                return e4;
            case 16:
                imy imyVar = (imy) obj;
                imyVar.getClass();
                return ((ifb) this.a).d(imyVar, (aauj) ioz.a.a());
            case 17:
                FileContentItem fileContentItem = (FileContentItem) obj;
                fileContentItem.getClass();
                MessagePartCoreData e5 = ((ifb) this.a).e(fileContentItem, (aauj) ipa.a.a());
                e5.getClass();
                return e5;
            case 18:
                aday adayVar = (aday) obj;
                adayVar.getClass();
                ?? r8 = adayVar.b;
                this.a.n(agek.h, new afqz((ascd) r8, i));
                return arnb.a;
            case 19:
                afxy afxyVar = (afxy) obj;
                afxyVar.getClass();
                afxyVar.e();
                ipc ipcVar = (ipc) this.a;
                ipcVar.k = false;
                ipcVar.l = null;
                return arnb.a;
            default:
                afxy afxyVar2 = (afxy) obj;
                afxyVar2.getClass();
                afxyVar2.i((Bundle) this.a);
                return arnb.a;
        }
    }
}
