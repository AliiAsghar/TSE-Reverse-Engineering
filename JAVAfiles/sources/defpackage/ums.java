package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ums extends unp {
    public static final alwo a = alwo.o("Bugle");
    public final armf b;
    public final uhj c;
    private final anen d;

    public ums(armf armfVar, anen anenVar, uhj uhjVar) {
        this.b = armfVar;
        this.d = anenVar;
        this.c = uhjVar;
    }

    public static void j(rtz rtzVar, uhj uhjVar, List list, boolean z) {
        if (rtzVar.e(list, z) > 0) {
            for (int i = 0; i < list.size(); i++) {
                uhjVar.e((ConversationIdType) list.get(i), true);
            }
        }
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("UpdateMarkUnreadHandler");
    }

    @Override // defpackage.unp
    public final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        return aktp.ai(new ulo(this, (umt) apbtVar, 9), this.d);
    }

    @Override // defpackage.unx
    public final apca e() {
        return umt.a.getParserForType();
    }
}
