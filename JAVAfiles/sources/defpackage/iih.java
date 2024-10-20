package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.vcard.VCardDetailActivity;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iih implements qky {
    static final utz a = uuh.i(uuh.b, "disable_logging_uma_contact_details_launch", false);
    private final uff b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final abbu g;
    private final msk h;
    private final armf i;

    public iih(uff uffVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, abbu abbuVar, msk mskVar, armf armfVar5) {
        this.b = uffVar;
        this.c = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.f = armfVar4;
        this.g = abbuVar;
        this.h = mskVar;
        this.i = armfVar5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x002e, code lost:
    
        if (true != defpackage.msx.g(r5)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (true != r9.u()) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
    
        r3 = "email";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void k(android.content.Context r8, defpackage.msh r9, int r10, java.util.List r11) {
        /*
            r7 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.INSERT"
            r0.<init>(r1)
            msu r1 = new msu
            r2 = 1
            r1.<init>(r2)
            java.lang.Object r1 = r1.get()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r3 = "phone"
            java.lang.String r4 = "email"
            if (r1 == 0) goto L24
            boolean r5 = r9.u()
            if (r2 == r5) goto L31
            goto L32
        L24:
            java.lang.String r5 = r9.m()
            xze r6 = defpackage.xca.a
            boolean r5 = defpackage.msx.g(r5)
            if (r2 == r5) goto L31
            goto L32
        L31:
            r3 = r4
        L32:
            java.lang.String r2 = "vnd.android.cursor.dir/contact"
            r0.setType(r2)
            armf r2 = r7.i
            java.lang.Object r2 = r2.b()
            opa r2 = (defpackage.opa) r2
            boolean r2 = r2.a()
            if (r2 == 0) goto L4a
            java.lang.String r9 = r9.l(r1)
            goto L4e
        L4a:
            java.lang.String r9 = r9.o(r1)
        L4e:
            r0.putExtra(r3, r9)
            if (r11 == 0) goto L63
            boolean r9 = r11.isEmpty()
            if (r9 != 0) goto L63
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r11)
            java.lang.String r11 = "data"
            r0.putParcelableArrayListExtra(r11, r9)
        L63:
            boolean r9 = r8 instanceof android.app.Activity
            if (r9 != 0) goto L6c
            r9 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r9)
        L6c:
            abbu r9 = r7.g
            r9.p(r8, r0)
            alhr r8 = defpackage.iil.a
            java.lang.Object r8 = r8.get()
            utz r8 = (defpackage.utz) r8
            java.lang.Object r8 = r8.e()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L91
            armf r8 = r7.d
            java.lang.Object r8 = r8.b()
            ibi r8 = (defpackage.ibi) r8
            r8.b(r10)
            return
        L91:
            armf r8 = r7.c
            java.lang.Object r8 = r8.b()
            mho r8 = (defpackage.mho) r8
            r8.av(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iih.k(android.content.Context, msh, int, java.util.List):void");
    }

    @Override // defpackage.qky
    public final void a(cg cgVar) {
        try {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("vnd.android.cursor.dir/contact");
            intent.addFlags(1);
            cgVar.startActivityForResult(intent, 143);
        } catch (ActivityNotFoundException e) {
            xzb.p("Bugle", e, "Couldn't find activity:");
            this.g.k(R.string.activity_not_found_message);
        }
    }

    @Override // defpackage.qky
    public final void b(Context context, Uri uri) {
        uff uffVar = this.b;
        Uri e = uhl.e(context, uri);
        d.s(uffVar.k(e));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setDataAndType(e, "text/x-vCard".toLowerCase(Locale.US));
        intent.addFlags(1);
        this.g.p(context, intent);
        if (((Boolean) ((utz) iil.a.get()).e()).booleanValue()) {
            ((ibi) this.d.b()).b(7);
        } else {
            ((mho) this.c.b()).av(7);
        }
    }

    @Override // defpackage.qky
    public final void c(Context context, Uri uri) {
        akto.n(context, new Intent(context, (Class<?>) VCardDetailActivity.class).putExtra("vcard_uri", uhl.e(context, uri)));
    }

    @Override // defpackage.qky
    public final void d(Context context, msh mshVar, int i, List list) {
        k(context, mshVar, i, list);
    }

    @Override // defpackage.qky
    public final void e(Context context, Uri uri, int i) {
        f(context, uri, i, null);
    }

    @Override // defpackage.qky
    public final void f(Context context, Uri uri, int i, List list) {
        Intent intent = new Intent("android.intent.action.EDIT");
        intent.setDataAndType(uri, "vnd.android.cursor.item/contact");
        intent.putExtra("finishActivityOnSaveCompleted", true);
        if (list != null && !list.isEmpty()) {
            intent.putParcelableArrayListExtra(GroupManagementRequest.DATA_TAG, new ArrayList<>(list));
        }
        this.g.p(context, intent);
        if (((Boolean) ((utz) iil.a.get()).e()).booleanValue()) {
            ((iil) ((ibi) this.e.b()).a).b(new iim(i, 0));
            return;
        }
        ((mho) this.c.b()).aE(i);
    }

    protected final void g(Context context, View view, Rect rect, long j, String str, long j2, msh mshVar, int i, List list) {
        Uri lookupUri;
        if (context == null && view != null) {
            context = view.getContext();
        }
        if (j != -1 && !TextUtils.isEmpty(str)) {
            if (j == -2) {
                lookupUri = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_LOOKUP_URI, str);
            } else {
                lookupUri = ContactsContract.Contacts.getLookupUri(j, str);
            }
            if (j2 != -1) {
                lookupUri = lookupUri.buildUpon().appendQueryParameter("directory", Long.toString(j2)).build();
            }
            context.getClass();
            String[] strArr = new String[0];
            if (view != null) {
                ContactsContract.QuickContact.showQuickContact(context, view, lookupUri, 3, strArr);
            } else if (rect != null) {
                ContactsContract.QuickContact.showQuickContact(context, rect, lookupUri, 3, strArr);
            }
            if (!((Boolean) a.e()).booleanValue()) {
                mbl mblVar = (mbl) this.f.b();
                int i2 = i - 1;
                if (i != 0) {
                    mblVar.e("Bugle.Contact.Details.Launch.Counts", i2);
                    return;
                }
                throw null;
            }
            return;
        }
        if (mshVar != null && !rxn.q(mshVar.o(((Boolean) new msu(1).get()).booleanValue()))) {
            msh u = this.h.u(mshVar);
            context.getClass();
            k(context, u, i, list);
        }
    }

    @Override // defpackage.qky
    public final void h(View view, long j, String str, long j2, msh mshVar, int i) {
        g(null, view, null, j, str, j2, mshVar, i, null);
    }

    @Override // defpackage.qky
    public final void i(Context context, Rect rect, long j, String str, long j2, msh mshVar, int i, List list) {
        g(context, null, rect, j, str, j2, mshVar, i, list);
    }

    @Override // defpackage.qky
    public final void j(Context context, msh mshVar) {
        k(context, mshVar, 8, null);
    }
}
