package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aalr extends xzs {
    public final String a;
    private final ex b;
    private final yck c;

    public aalr(String str, Activity activity, String str2, yck yckVar) {
        super(str);
        this.b = (ex) activity;
        this.a = str2;
        this.c = yckVar;
    }

    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        String[] list = this.c.b(this.b.getApplicationContext()).list(new akam(this, 1));
        list.getClass();
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String[], java.io.Serializable] */
    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        ?? r6 = (String[]) obj;
        if (r6 != 0 && r6.length > 0) {
            da a = this.b.a();
            new bd(a);
            String str = this.a;
            aakc aakcVar = new aakc();
            Bundle bundle = new Bundle();
            bundle.putSerializable("dump_files", r6);
            bundle.putString(GroupManagementRequest.ACTION_TAG, str);
            aakcVar.ak(bundle);
            aakcVar.q(a, "");
        }
    }
}
