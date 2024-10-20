package defpackage;

import android.util.Base64;
import com.google.android.rcs.client.messaging.data.ContentType;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajsd {
    private static final alvi a = alvi.m("com/google/android/rcs/client/messaging/serializers/ProtoMessageSerializer");
    private final Set b;

    public ajsd(Set set) {
        set.getClass();
        this.b = set;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, apbt] */
    public static final apbt c(akyr akyrVar, ajrt ajrtVar) {
        ?? d = ((apca) akyrVar.d.a()).d(Base64.decode(ajrtVar.a.H(), 0));
        d.getClass();
        return d;
    }

    public final ajrt a(apbt apbtVar, artf artfVar) {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (d.F(((akyr) obj).c, armd.d(artfVar))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        akyr akyrVar = (akyr) obj;
        if (akyrVar != null) {
            ajur ajurVar = new ajur(null);
            ajurVar.g((ContentType) akyrVar.b);
            ajurVar.f(aozb.w(Base64.encode(apbtVar.toByteArray(), 0)));
            return ajurVar.e();
        }
        throw new IllegalArgumentException(a.cc(artfVar, "Unknown proto: ", ", please register it."));
    }

    public final akyr b(ContentType contentType) {
        Object obj;
        contentType.getClass();
        Iterator it = this.b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (d.F(((akyr) obj).b, contentType)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        akyr akyrVar = (akyr) obj;
        if (akyrVar == null) {
            ((alvg) a.i().h("com/google/android/rcs/client/messaging/serializers/ProtoMessageSerializer", "findProtoConfigByContentType", 44, "ProtoMessageSerializer.kt")).t("Unknown content type: %s, please register it.", contentType);
        }
        return akyrVar;
    }
}
