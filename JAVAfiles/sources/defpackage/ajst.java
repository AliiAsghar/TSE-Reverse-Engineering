package defpackage;

import android.net.Uri;
import com.google.android.rcs.client.messaging.data.ContentType;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ajst extends algf {
    @Override // defpackage.algf
    protected final /* synthetic */ Object a(Object obj) {
        ajqf ajqfVar = (ajqf) obj;
        aozy createBuilder = wbu.a.createBuilder();
        wbi wbiVar = (wbi) ajtm.a.m().fu(ajqfVar.a);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wbu wbuVar = (wbu) createBuilder.b;
        wbiVar.getClass();
        wbuVar.c = wbiVar;
        wbuVar.b |= 1;
        c(ajqfVar, createBuilder);
        return (wbu) createBuilder.s();
    }

    @Override // defpackage.algf
    protected final /* synthetic */ Object b(Object obj) {
        Object obj2;
        wbu wbuVar = (wbu) obj;
        ajur ajurVar = new ajur(null);
        if ((wbuVar.b & 1) != 0) {
            algf algfVar = ajtm.a;
            wbi wbiVar = wbuVar.c;
            if (wbiVar == null) {
                wbiVar = wbi.a;
            }
            ContentType contentType = (ContentType) algfVar.fu(wbiVar);
            if (contentType != null) {
                ajurVar.a = contentType;
            } else {
                throw new NullPointerException("Null contentType");
            }
        }
        if ((wbuVar.b & 2) != 0) {
            d(wbuVar, ajurVar);
        }
        Object obj3 = ajurVar.a;
        if (obj3 != null && (obj2 = ajurVar.b) != null) {
            return new ajqf((ContentType) obj3, (Uri) obj2);
        }
        StringBuilder sb = new StringBuilder();
        if (ajurVar.a == null) {
            sb.append(" contentType");
        }
        if (ajurVar.b == null) {
            sb.append(" contentUri");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public abstract void c(ajqf ajqfVar, aozy aozyVar);

    public abstract void d(wbu wbuVar, ajur ajurVar);
}
