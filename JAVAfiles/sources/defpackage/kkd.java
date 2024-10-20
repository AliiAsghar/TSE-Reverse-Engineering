package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kkd extends arpw implements arrb {
    public /* synthetic */ Object a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public /* synthetic */ boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ kke h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkd(kke kkeVar, arpe arpeVar) {
        super(8, arpeVar);
        this.h = kkeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [miu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        boolean z;
        ResolvedRecipient resolvedRecipient;
        String str;
        boolean z2;
        aewg aewgVar;
        kdt kdtVar;
        boolean z3;
        String s;
        String z4;
        aqil.P(obj);
        ?? r3 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        ?? r4 = this.d;
        Object obj4 = this.e;
        boolean z5 = this.f;
        Object obj5 = this.g;
        if (obj3 != null) {
            return new afar((String) obj3, null, false, new jya(this.h, 17, (boolean[][][]) null), aezo.f);
        }
        kke kkeVar = this.h;
        List list = ((khd) obj2).a;
        if (!list.isEmpty()) {
            return new afas(String.valueOf(list.size()), null, null, false, null, new afaq(kkeVar.h.a()), null, 190);
        }
        if (ofn.a() && obj5 != mmy.b) {
            z = false;
        } else {
            z = true;
        }
        String h = r3.h();
        if (h == null) {
            h = "";
        }
        if (((ansy) ((nkw) kkeVar.g).a.b()).e("bugle.limit_conversation_title_length")) {
            h = h.substring(0, Math.min(h.length(), 100));
            h.getClass();
        }
        String str2 = h;
        if (((Boolean) kkeVar.e.b()).booleanValue() && r3.b() == mit.ONE_ON_ONE) {
            if (((pbz) kkeVar.j.b()).a()) {
                resolvedRecipient = (ResolvedRecipient) aqjn.ah(r4);
                if (resolvedRecipient == null) {
                    alvw i = kke.a.i();
                    i.X(alwp.a, "BugleConversation");
                    alvg alvgVar = (alvg) i;
                    alvgVar.X(ydl.q, r3.c());
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation2/topcontent/topappbar/TopAppBarMiddleUiAdapterImpl", "getOneOnOneRecipientOrNull", 278, "TopAppBarMiddleUiAdapterImpl.kt")).q("Missing a single recipient for 1:1 conversation, can't render top bar.");
                }
            } else {
                resolvedRecipient = (ResolvedRecipient) aqjn.ag(r4);
            }
        } else {
            resolvedRecipient = null;
        }
        if (resolvedRecipient != null && (s = resolvedRecipient.s()) != null) {
            if (qta.r()) {
                z4 = wfh.x(s);
            } else {
                z4 = kkeVar.r.z(s);
            }
            z4.getClass();
            str = vom.b(z4);
        } else {
            str = null;
        }
        if (((Boolean) kkeVar.e.b()).booleanValue()) {
            aevv r = ((vyv) kkeVar.f.b()).r(r3, (alog) r4);
            if (r != null) {
                aewgVar = new aewg(r, null, 0, null, null, 62);
            }
            aewgVar = null;
        } else {
            Uri a = r3.a();
            if (a != null) {
                if (r3.b() == mit.GROUP && ((alog) r4).size() != 1) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                aewgVar = new aewg(new aevv(a, Boolean.valueOf(z2), vyv.T(kkeVar.q), null, null, 24), null, 0, null, null, 62);
            }
            aewgVar = null;
        }
        afaq afaqVar = new afaq(kkeVar.h.a());
        if (z) {
            kdtVar = new kdt((Object) kkeVar, (Object) r3, (Object) r4, 3, (byte[]) null);
        } else {
            kdtVar = null;
        }
        if (((Boolean) kkeVar.d.b()).booleanValue() && (obj4 != null || z5)) {
            z3 = true;
        } else {
            z3 = false;
        }
        return new afas(str2, str, aewgVar, z3, (afam) obj4, afaqVar, kdtVar, 8);
    }
}
