package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uin {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingManagerV2");
    public final Context b;
    public final armf c;
    final Map d = new HashMap();
    public final zai e;
    public final wpp f;
    private final yfr g;
    private final anen h;
    private final uli i;

    public uin(Context context, wpp wppVar, zai zaiVar, armf armfVar, uli uliVar, yfr yfrVar, anen anenVar) {
        this.b = context;
        this.f = wppVar;
        this.e = zaiVar;
        this.c = armfVar;
        this.i = uliVar;
        this.g = yfrVar;
        this.h = anenVar;
    }

    public static boolean c(String str) {
        return gh.n(str, false);
    }

    /* JADX WARN: Type inference failed for: r9v8, types: [armf, java.lang.Object] */
    public final akul a(Uri uri, long j, String str) {
        String str2;
        try {
            long a2 = this.g.a(j);
            if (str == null) {
                str2 = ydk.p(this.b, uri);
            } else {
                str2 = str;
            }
            if (str2 != null && (c(str2) || gh.z(str2))) {
                aozy createBuilder = uip.a.createBuilder();
                String uri2 = uri.toString();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                uip uipVar = (uip) apagVar;
                uri2.getClass();
                uipVar.b |= 1;
                uipVar.c = uri2;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar2 = createBuilder.b;
                uip uipVar2 = (uip) apagVar2;
                uipVar2.b |= 2;
                uipVar2.d = j;
                if (!apagVar2.isMutable()) {
                    createBuilder.u();
                }
                uip uipVar3 = (uip) createBuilder.b;
                uipVar3.b |= 4;
                uipVar3.e = a2;
                uip uipVar4 = (uip) createBuilder.s();
                if (!this.d.containsKey(uipVar4)) {
                    ((mbl) this.c.b()).c("Bugle.Media.Attachment.ResizeV2.Started.Count");
                    Map map = this.d;
                    uli uliVar = this.i;
                    aozy createBuilder2 = uio.a.createBuilder();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    apag apagVar3 = createBuilder2.b;
                    uio uioVar = (uio) apagVar3;
                    uipVar4.getClass();
                    uioVar.c = uipVar4;
                    uioVar.b |= 1;
                    if (!apagVar3.isMutable()) {
                        createBuilder2.u();
                    }
                    uio uioVar2 = (uio) createBuilder2.b;
                    uioVar2.b |= 2;
                    uioVar2.d = str2;
                    map.put(uipVar4, ((uof) uliVar.a.b()).a(upk.a("resizing", (uio) createBuilder2.s())).a().h(new uhw(3), andi.a));
                } else {
                    ((mbl) this.c.b()).c("Bugle.Media.Attachment.ResizeV2.Retrieved.Count");
                }
                return (akul) this.d.get(uipVar4);
            }
            alvw i = a.i();
            i.X(alwp.a, "BugleResizing");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingManagerV2", "resize", 121, "ResizingManagerV2.java")).t("Input uri %s is not resizable", uri);
            ((mbl) this.c.b()).c("Bugle.Media.Attachment.Resize.UnsupportedType.Count");
            aozy createBuilder3 = uiq.a.createBuilder();
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            ((uiq) createBuilder3.b).c = a.ao(4);
            return aktp.ag((uiq) createBuilder3.s());
        } catch (apba e) {
            alvw i2 = a.i();
            i2.X(alwp.a, "BugleResizing");
            ((alvg) ((alvg) ((alvg) i2).g(e)).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingManagerV2", "resize", 108, "ResizingManagerV2.java")).t("Unable to get image compression long dimension from setting for input uri: %s", uri);
            aozy createBuilder4 = uiq.a.createBuilder();
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            ((uiq) createBuilder4.b).c = a.ao(4);
            return aktp.ag((uiq) createBuilder4.s());
        }
    }

    public final void b(Uri uri, long j) {
        try {
            long a2 = this.g.a(j);
            aozy createBuilder = uip.a.createBuilder();
            String uri2 = uri.toString();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            uip uipVar = (uip) apagVar;
            uri2.getClass();
            uipVar.b |= 1;
            uipVar.c = uri2;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            apag apagVar2 = createBuilder.b;
            uip uipVar2 = (uip) apagVar2;
            uipVar2.b |= 2;
            uipVar2.d = j;
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            uip uipVar3 = (uip) createBuilder.b;
            uipVar3.b |= 4;
            uipVar3.e = a2;
            uip uipVar4 = (uip) createBuilder.s();
            if (this.d.containsKey(uipVar4)) {
                ((mbl) this.c.b()).c("Bugle.Media.Attachment.ResizeV2.Cancelled.Count");
                akul akulVar = (akul) this.d.remove(uipVar4);
                if (akulVar != null && !akulVar.cancel(false)) {
                    akulVar.i(new tsz(this, 14), this.h);
                }
            }
        } catch (apba e) {
            alvw i = a.i();
            i.X(alwp.a, "BugleResizing");
            ((alvg) ((alvg) ((alvg) i).g(e)).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingManagerV2", "cancel", 147, "ResizingManagerV2.java")).t("Unable to get image compression long dimension from setting for input uri: %s", uri);
        }
    }
}
