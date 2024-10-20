package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rtl extends rtu implements ufz {
    private final Context a;
    private final Uri b;
    private final uga d;
    private String e;
    private final rrb f;
    private uey g;
    private final Uri h;
    private final lrf i;
    private final uli j;

    public rtl(Context context, lrf lrfVar, xvc xvcVar, uga ugaVar, uli uliVar, Uri uri) {
        this.f = new rrb();
        this.a = context;
        this.e = context.getString(R.string.loading_vcard);
        this.b = uri;
        this.i = lrfVar;
        this.d = ugaVar;
        this.j = uliVar;
        this.h = xvcVar.a();
    }

    @Override // defpackage.rtu
    public final long a() {
        return -1L;
    }

    @Override // defpackage.rtu
    public final long b() {
        return -1L;
    }

    @Override // defpackage.rtu
    public final Intent c() {
        return null;
    }

    @Override // defpackage.rtu
    public final Uri d() {
        if (q()) {
            List list = this.g.a;
            xyl.k(!list.isEmpty());
            lrf lrfVar = this.i;
            xyl.l(list);
            xyl.k(!list.isEmpty());
            if (list.size() == 1) {
                return lrfVar.o((ufb) list.get(0));
            }
            int min = Math.min(list.size(), 4);
            ArrayList arrayList = new ArrayList(min);
            for (int i = 0; i < min; i++) {
                arrayList.add(lrfVar.o((ufb) list.get(i)));
            }
            return xvc.f((Context) lrfVar.a, arrayList);
        }
        return this.h;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
    @Override // defpackage.rqz
    public final void e(String str) {
        super.e(str);
        Uri uri = this.b;
        if (uri != null) {
            uli uliVar = this.j;
            rrb rrbVar = this.f;
            Context context = this.a;
            zai zaiVar = (zai) uliVar.a.b();
            zaiVar.getClass();
            rrbVar.c(new uew(zaiVar, uri).e(context, this));
            this.d.b((ufw) this.f.a());
        }
    }

    @Override // defpackage.rqz
    public final void f(String str) {
        super.f(str);
        if (this.b != null) {
            this.f.f();
            uey ueyVar = this.g;
            if (ueyVar != null) {
                ueyVar.q();
                this.g = null;
            }
        }
    }

    @Override // defpackage.ufz
    public final void fC(ufw ufwVar) {
        rtt rttVar;
        this.f.d();
        this.e = this.a.getString(R.string.failed_loading_vcard);
        if (h() && (rttVar = this.c) != null) {
            rttVar.a(this);
        }
    }

    @Override // defpackage.ufz
    public final /* bridge */ /* synthetic */ void fD(ufw ufwVar, ugg uggVar, boolean z) {
        boolean z2;
        rtt rttVar;
        uey ueyVar = (uey) uggVar;
        if (this.g == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        d.s(z2);
        this.f.d();
        this.e = this.a.getResources().getQuantityString(R.plurals.vcard_tap_hint_new, ueyVar.a.size());
        this.g = ueyVar;
        ueyVar.p();
        if (h() && (rttVar = this.c) != null) {
            rttVar.b(this);
        }
    }

    @Override // defpackage.rtu
    public final Optional j() {
        return Optional.empty();
    }

    @Override // defpackage.rtu
    public final Optional k() {
        return Optional.empty();
    }

    @Override // defpackage.rtu
    public final String l() {
        return this.e;
    }

    @Override // defpackage.rtu
    public final String m() {
        if (q()) {
            List list = this.g.a;
            xyl.k(!list.isEmpty());
            if (list.size() == 1) {
                return ((ufb) list.get(0)).d;
            }
            return this.a.getResources().getQuantityString(R.plurals.vcard_multiple_display_name, list.size(), Integer.valueOf(list.size()));
        }
        return null;
    }

    @Override // defpackage.rtu
    public final String n() {
        return null;
    }

    public final Uri o() {
        if (q()) {
            return this.b;
        }
        return null;
    }

    public final List p() {
        if (q()) {
            return this.g.a;
        }
        int i = alog.d;
        return alsx.a;
    }

    public final boolean q() {
        if (h() && this.g != null) {
            return true;
        }
        return false;
    }

    public rtl(Context context, lrf lrfVar, xvc xvcVar, uga ugaVar, uli uliVar, MessagePartCoreData messagePartCoreData) {
        this(context, lrfVar, xvcVar, ugaVar, uliVar, messagePartCoreData.t());
        xyl.k(messagePartCoreData.by());
    }
}
