package defpackage;

import android.os.Debug;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akip {
    public final boolean a;

    public /* synthetic */ akip(boolean z) {
        this.a = z;
    }

    public static final void c(syc sycVar, BugleConversationId bugleConversationId) {
        sycVar.q(false);
        alob alobVar = new alob();
        alobVar.h(3);
        alobVar.h(16);
        if (oea.a() && qrl.a()) {
            alobVar.h(235);
            alobVar.h(237);
            alobVar.h(216);
            alobVar.h(219);
            alobVar.h(238);
            alobVar.h(236);
            alobVar.h(215);
            alobVar.h(214);
            alobVar.h(223);
            alobVar.h(224);
            alobVar.h(222);
            alobVar.h(233);
            alobVar.h(234);
            alobVar.h(252);
            alobVar.h(208);
        }
        sycVar.S(alobVar.g());
        sycVar.f(bugleConversationId.a);
    }

    public static final void d(syc sycVar, mts mtsVar) {
        if (mtsVar.a()) {
            sycVar.b(new mtl(mtsVar, 12), new mtl(mtsVar, 13), new mtl(mtsVar, 14));
        } else {
            sycVar.b(new mtl(mtsVar, 15), new mtl(mtsVar, 16));
        }
    }

    public static final void e(syc sycVar, mts mtsVar) {
        if (mtsVar.a()) {
            sycVar.b(new mtl(mtsVar, 17), new mtl(mtsVar, 18), new mtl(mtsVar, 19));
        } else {
            sycVar.b(new mtl(mtsVar, 20), new mtl(mtsVar, 11));
        }
    }

    public final boolean a() {
        if (!Debug.isDebuggerConnected() && this.a) {
            return true;
        }
        return false;
    }

    public final sxy b(sxy sxyVar) {
        if (!this.a) {
            return sxyVar;
        }
        tbs d = PartsTable.d();
        d.w("fanOutWhenFlatteningIfNeeded");
        d.e(new mtm(16));
        sxyVar.D(agoh.b(d.b(), PartsTable.d.b, MessagesTable.c.a).a());
        return sxyVar;
    }

    public final jhl f(jhn jhnVar) {
        int ordinal = jhnVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return jhl.e;
                    }
                    throw new armm();
                }
                return jhl.d;
            }
            return jhl.c;
        }
        if (this.a) {
            return jhl.b;
        }
        return jhl.a;
    }

    @armg
    public final jhm g(jst jstVar) {
        if (!d.F(jstVar, jss.b) && !d.F(jstVar, jss.a) && !d.F(jstVar, jss.c)) {
            throw new armm();
        }
        if (this.a) {
            return jhm.b;
        }
        return jhm.a;
    }

    public akip(boolean z, char[] cArr) {
        this.a = z;
    }

    public akip(byte[] bArr) {
        this.a = !xyp.j();
    }

    public akip() {
        this.a = ((Boolean) acpx.a.a()).booleanValue();
    }

    public akip(ahub ahubVar) {
        ahubVar.a();
        this.a = false;
    }
}
