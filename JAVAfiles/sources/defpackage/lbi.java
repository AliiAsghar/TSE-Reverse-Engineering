package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.photos.client.MediaUploadStates;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lbi implements akbp<Void, MediaUploadStates> {
    public static final arml a = armd.a(kek.l);
    public rsr b;
    private final armf c;

    public lbi(armf armfVar) {
        armfVar.getClass();
        this.c = armfVar;
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        ((alwl) ((alwl) lga.B().h()).g(th)).q("Requesting media upload states failed");
        qiu.h(((uvi) this.c.b()).b(th));
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void c(Object obj, Object obj2) {
        MediaUploadStates mediaUploadStates = (MediaUploadStates) obj2;
        mediaUploadStates.getClass();
        alvw m = lga.B().m();
        Collection values = mediaUploadStates.a.values();
        ArrayList arrayList = new ArrayList(aqjn.J(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            Class<?> cls = ((afvq) it.next()).getClass();
            int i = arsc.a;
            arrayList.add(new arrh(cls).c());
        }
        m.t("Requesting media upload states successful with states: %s", arrayList);
        rsr rsrVar = this.b;
        if (rsrVar != null) {
            Map map = mediaUploadStates.a;
            boolean z = false;
            for (MessagePartCoreData messagePartCoreData : rsrVar.B()) {
                Uri t = messagePartCoreData.t();
                t.getClass();
                String uri = t.toString();
                if (map.containsKey(uri)) {
                    messagePartCoreData.aA((afvq) map.get(uri));
                    z = true;
                }
            }
            if (z) {
                rsrVar.I(1);
            }
        }
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void b(Object obj) {
    }
}
