package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zyr implements zyn {
    private final Context a;
    private final boolean b;
    private final boolean c;
    private final alog d;
    private final String e;
    private final String f;

    public zyr(Context context, boolean z, boolean z2, alog alogVar) {
        this.a = context;
        this.b = z;
        this.c = z2;
        this.d = alogVar;
        String string = context.getString(R.string.more_about_rcs_chats);
        string.getClass();
        this.e = string;
        String string2 = context.getString(R.string.encryption_status_details_on_group_v3, string);
        string2.getClass();
        this.f = string2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zyn
    public final zyq a() {
        zyq zyqVar;
        String string;
        String str;
        if (this.b) {
            return new zyq(1, this.f);
        }
        if (this.c) {
            int size = this.d.size();
            if (size != 0) {
                if (size != 1) {
                    if (size != 2) {
                        String str2 = (String) this.d.get(0);
                        int size2 = this.d.size() - 1;
                        str = this.a.getResources().getQuantityString(R.plurals.encryption_status_user_and_other_users_group, size2, str2, Integer.valueOf(size2), this.e);
                    } else {
                        str = this.a.getResources().getQuantityString(R.plurals.encryption_status_user_and_other_users_group, 1, (String) this.d.get(0), (String) this.d.get(1), this.e);
                    }
                } else {
                    str = this.a.getString(R.string.encryption_status_user_group, (String) this.d.get(0), this.e);
                }
            } else {
                str = null;
            }
            zyqVar = new zyq(2, str);
        } else {
            int size3 = this.d.size();
            if (size3 != 0) {
                if (size3 != 1) {
                    alog alogVar = this.d;
                    Context context = this.a;
                    int size4 = alogVar.size();
                    string = context.getResources().getQuantityString(R.plurals.encryption_status_self_and_other_users_group, size4, Integer.valueOf(size4), this.e);
                } else {
                    string = this.a.getResources().getQuantityString(R.plurals.encryption_status_self_and_other_users_group, 1, (String) this.d.get(0), this.e);
                }
            } else {
                string = this.a.getString(R.string.encryption_status_self_group, this.e);
            }
            string.getClass();
            zyqVar = new zyq(2, string);
        }
        return zyqVar;
    }
}
