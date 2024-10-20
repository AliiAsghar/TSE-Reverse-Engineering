package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yce {
    public static final uuf a = uuh.m(uuh.b, "directory_query_limit", "100");
    public final Context b;
    public final armf c;
    public final armf d;
    private final armf e;
    private final armf f;

    public yce(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        this.b = context;
        this.c = armfVar;
        this.e = armfVar2;
        this.d = armfVar3;
        this.f = armfVar4;
    }

    public final String a(Uri uri) {
        Throwable th;
        Cursor cursor = null;
        r1 = null;
        String string = null;
        if (!((yjf) this.c.b()).f()) {
            return null;
        }
        try {
            Cursor a2 = new rri(this.b, uri, new String[]{"lookup"}, null, null, null).a();
            if (a2 != null) {
                try {
                    if (a2.moveToFirst()) {
                        string = a2.getString(0);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = a2;
                    if (cursor != null) {
                        cursor.close();
                        throw th;
                    }
                    throw th;
                }
            }
            if (a2 != null) {
                a2.close();
            }
            return string;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final String b(long j) {
        rri rriVar;
        Cursor cursor = null;
        r2 = null;
        String string = null;
        if (ContactsContract.Contacts.isEnterpriseContactId(j)) {
            return null;
        }
        try {
            if (!((yjf) this.c.b()).f()) {
                rriVar = new rri(this.b, Uri.EMPTY, null, null, null, null);
            } else {
                rriVar = new rri(this.b, ContactsContract.Contacts.CONTENT_URI.buildUpon().appendPath(String.valueOf(j)).appendPath(GroupManagementRequest.DATA_TAG).build(), ycd.a, "mimetype=? AND display_name=data1", new String[]{"vnd.android.cursor.item/name"}, null);
            }
            Cursor a2 = rriVar.a();
            if (a2 != null) {
                try {
                    if (a2.moveToFirst()) {
                        string = a2.getString(1);
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = a2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (a2 != null) {
                a2.close();
            }
            return string;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final Cursor c(msh mshVar) {
        rri rriVar;
        rri rriVar2;
        String ag = albo.ag(mshVar.i());
        if (((yjf) this.c.b()).f() && !TextUtils.isEmpty(ag.trim())) {
            xze xzeVar = xca.a;
            if (msx.g(ag)) {
                if (!((yjf) this.c.b()).f()) {
                    rriVar2 = new rri(this.b, Uri.EMPTY, null, null, null, null);
                } else {
                    rriVar2 = new rri(this.b, ContactsContract.CommonDataKinds.Email.ENTERPRISE_CONTENT_LOOKUP_URI.buildUpon().appendPath(ag).appendQueryParameter("directory", "0").build(), yca.a, null, null, "sort_key");
                }
                return rriVar2.b(this.e);
            }
            if (!((yjf) this.c.b()).f()) {
                rriVar = new rri(this.b, Uri.EMPTY, null, null, null, null);
            } else {
                Uri build = ContactsContract.PhoneLookup.ENTERPRISE_CONTENT_FILTER_URI.buildUpon().appendPath(ag).build();
                rriVar = new rri(this.b, build, ycb.a, null, null, null);
            }
            return rriVar.b(this.e);
        }
        return null;
    }
}
