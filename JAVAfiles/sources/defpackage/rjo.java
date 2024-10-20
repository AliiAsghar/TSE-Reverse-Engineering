package defpackage;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.UploadAttachmentsToBlobstoreAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rjo implements rhp {
    private final armf a;
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;

    public rjo() {
        throw null;
    }

    public static boolean b(MessagePartCoreData messagePartCoreData, boolean z) {
        if (z) {
            if (messagePartCoreData.t() != null) {
                if ((TextUtils.isEmpty(messagePartCoreData.P()) || messagePartCoreData.aY()) && !messagePartCoreData.aR()) {
                    return true;
                }
                if (messagePartCoreData.bk() && ((TextUtils.isEmpty(messagePartCoreData.S()) || messagePartCoreData.bb()) && !messagePartCoreData.aS())) {
                    return true;
                }
            }
            return false;
        }
        if (messagePartCoreData.t() != null) {
            return true;
        }
        return false;
    }

    public final Action a(rwy rwyVar) {
        alog r = alog.r(rwyVar);
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(null)) {
            alur it = r.iterator();
            while (it.hasNext()) {
                for (MessagePartCoreData messagePartCoreData : ((rwy) it.next()).W()) {
                    if (b(messagePartCoreData, false)) {
                        arrayList.add(messagePartCoreData);
                    }
                }
            }
        } else {
            alur it2 = r.iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((rwy) it2.next()).W().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        MessagePartCoreData messagePartCoreData2 = (MessagePartCoreData) it3.next();
                        if (TextUtils.equals(messagePartCoreData2.Z(), null) && b(messagePartCoreData2, false)) {
                            arrayList.add(messagePartCoreData2);
                            break;
                        }
                    }
                }
            }
        }
        trs trsVar = (trs) this.a.b();
        trsVar.getClass();
        vby vbyVar = (vby) this.b.b();
        vbyVar.getClass();
        anen anenVar = (anen) this.d.b();
        anenVar.getClass();
        armf armfVar = this.e;
        armf armfVar2 = this.f;
        Optional optional = (Optional) ((apxx) armfVar).a;
        agxw agxwVar = (agxw) armfVar2.b();
        agxwVar.getClass();
        return new UploadAttachmentsToBlobstoreAction(trsVar, vbyVar, this.c, anenVar, optional, agxwVar, arrayList, this.g);
    }

    @Override // defpackage.rhp
    public final /* synthetic */ Action c(Parcel parcel) {
        trs trsVar = (trs) this.a.b();
        trsVar.getClass();
        vby vbyVar = (vby) this.b.b();
        vbyVar.getClass();
        anen anenVar = (anen) this.d.b();
        anenVar.getClass();
        Optional optional = (Optional) ((apxx) this.e).a;
        agxw agxwVar = (agxw) this.f.b();
        agxwVar.getClass();
        parcel.getClass();
        return new UploadAttachmentsToBlobstoreAction(trsVar, vbyVar, this.c, anenVar, optional, agxwVar, this.g, parcel);
    }

    public rjo(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
        armfVar5.getClass();
        this.e = armfVar5;
        armfVar6.getClass();
        this.f = armfVar6;
        armfVar7.getClass();
        this.g = armfVar7;
    }
}
