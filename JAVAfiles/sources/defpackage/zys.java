package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zys implements zyn {
    private final Context a;
    private final boolean b;
    private final boolean c;
    private final amjj d;
    private final alor e;
    private final nfw f;
    private final boolean g;
    private final alog h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;

    public zys(Context context, boolean z, boolean z2, amjj amjjVar, alor alorVar, nfw nfwVar, boolean z3, alog alogVar) {
        this.a = context;
        this.b = z;
        this.c = z2;
        this.d = amjjVar;
        this.e = alorVar;
        this.f = nfwVar;
        this.g = z3;
        this.h = alogVar;
        String string = context.getString(R.string.more_about_rcs_chats);
        string.getClass();
        this.i = string;
        String string2 = context.getString(R.string.encryption_status_details_off, string);
        string2.getClass();
        this.j = string2;
        String string3 = context.getString(R.string.encryption_status_details_send_only_xms, string);
        string3.getClass();
        this.k = string3;
        String string4 = context.getString(R.string.encryption_status_details_off, string);
        string4.getClass();
        this.l = string4;
        String string5 = context.getResources().getString(R.string.encryption_status_details_on_default_v3, string);
        string5.getClass();
        this.m = string5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zyn
    public final zyq a() {
        int i;
        String string;
        amjj amjjVar;
        boolean z = this.c;
        if (z && this.b && (amjjVar = this.d) != amjj.SEND_MODE_XMS && amjjVar != amjj.SEND_MODE_XMS_LATCH) {
            i = 1;
        } else {
            i = 2;
        }
        if (!this.b) {
            string = this.j;
        } else {
            amjj amjjVar2 = this.d;
            if (amjjVar2 == amjj.SEND_MODE_XMS) {
                string = this.k;
            } else if (amjjVar2 == amjj.SEND_MODE_XMS_LATCH) {
                string = this.l;
            } else if (z && this.e.size() == 1) {
                nfw nfwVar = this.f;
                if (nfwVar != null) {
                    String l = nfwVar.l();
                    if (oed.a()) {
                        string = this.a.getString(R.string.encryption_status_details_on_1on1_v4, wfh.y(l), this.i);
                        string.getClass();
                    } else {
                        string = this.a.getString(R.string.encryption_status_details_on_1on1_v3, wfh.y(l), this.i);
                        string.getClass();
                    }
                } else if (oed.a()) {
                    string = this.a.getString(R.string.encryption_status_details_on_1on1_fallback_v4, this.i);
                    string.getClass();
                } else {
                    string = this.a.getString(R.string.encryption_status_details_on_1on1_fallback_v3, this.i);
                    string.getClass();
                }
            } else if (this.c && this.e.size() != 1) {
                string = this.m;
            } else if (this.g) {
                if (this.h.size() == 1) {
                    string = this.a.getString(R.string.encryption_status_user, (String) this.h.get(0), this.i);
                }
                string = null;
            } else {
                int size = this.h.size();
                if (size != 0) {
                    if (size == 1) {
                        string = this.a.getString(R.string.encryption_status_self_and_other_user, (String) this.h.get(0), this.i);
                    }
                    string = null;
                } else {
                    string = this.a.getString(R.string.encryption_status_self, this.i);
                }
            }
        }
        return new zyq(i, string);
    }
}
