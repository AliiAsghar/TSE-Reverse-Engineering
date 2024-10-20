package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zij extends zhz {
    private final xbf g;
    private final boolean h;
    private final zjx i;
    private zke j;
    private final zbl k;
    private final zxy l;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class a implements akvv {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }
    }

    public zij(zxy zxyVar, xbf xbfVar, Context context, zbl zblVar, zjx zjxVar, int i, boolean z) {
        super(context);
        this.l = zxyVar;
        this.k = zblVar;
        this.i = zjxVar;
        this.e = i;
        this.g = xbfVar;
        this.h = z;
    }

    @Override // defpackage.zhz
    public final void b(int i) {
        this.f.getClass();
        boolean z = false;
        if (this.h) {
            if (i == 1) {
                z = true;
            }
            aktp.K(new a(z), this.i.ah);
        } else {
            ykw x = this.l.x(this.e);
            String string = this.a.getString(R.string.group_mms_pref_key);
            if (i == 1) {
                z = true;
            }
            x.h(string, z);
        }
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zhz
    public final void c() {
        int i;
        Optional empty;
        if (this.h) {
            if (this.j == null) {
                this.j = this.k.a(this.e);
            }
            zkb a2 = this.j.a();
            if ((a2.b & 64) != 0) {
                empty = Optional.of(Boolean.valueOf(a2.i));
            } else {
                empty = Optional.empty();
            }
            i = ((Boolean) empty.orElse(Boolean.valueOf(this.g.a(this.e).n()))).booleanValue();
        } else {
            i = this.l.x(this.e).q(this.a.getString(R.string.group_mms_pref_key), this.g.a(this.e).n());
        }
        CharSequence[] charSequenceArr = {this.a.getString(R.string.disable_group_mms), this.a.getString(R.string.enable_group_mms)};
        this.b = this.a.getString(R.string.group_mms_pref_title);
        this.c = charSequenceArr;
        this.d = i;
        this.e = this.e;
        super.c();
    }
}
