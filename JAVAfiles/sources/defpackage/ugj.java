package defpackage;

import android.content.Context;
import android.net.Uri;
import com.android.vcard.VCardEntry;
import com.android.vcard.VCardInterpreter;
import com.android.vcard.VCardProperty;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ugj implements VCardInterpreter {
    public VCardEntry b;
    private final int d;
    public final List a = new ArrayList();
    public final List c = new ArrayList();

    public ugj(int i) {
        this.d = i;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [armf, java.lang.Object] */
    @Override // com.android.vcard.VCardInterpreter
    public final void onEntryEnded() {
        Uri uri;
        msh mshVar;
        VCardEntry vCardEntry = this.b;
        vCardEntry.getClass();
        vCardEntry.consolidateFields();
        for (use useVar : this.c) {
            xyl.h();
            String displayName = vCardEntry.getDisplayName();
            List<VCardEntry.PhotoData> photoList = vCardEntry.getPhotoList();
            if (photoList != null && !photoList.isEmpty()) {
                Iterator<VCardEntry.PhotoData> it = photoList.iterator();
                uri = null;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    byte[] bytes = it.next().getBytes();
                    if (bytes != null) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                        try {
                            Uri g = uhl.g(byteArrayInputStream, ((uev) useVar.b).b);
                            if (g != null) {
                                uri = g;
                                break;
                            } else {
                                try {
                                    byteArrayInputStream.close();
                                } catch (IOException unused) {
                                }
                                uri = g;
                            }
                        } finally {
                            try {
                                byteArrayInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                }
            } else {
                uri = null;
            }
            if (uri == null) {
                List<VCardEntry.PhoneData> phoneList = vCardEntry.getPhoneList();
                if (phoneList != null && !phoneList.isEmpty()) {
                    mshVar = ((msk) ((uev) useVar.b).a.b()).k(((msk) ((uev) useVar.b).a.b()).n(phoneList.get(0).getNumber()));
                } else {
                    mshVar = null;
                }
                if (mshVar == null) {
                    List<VCardEntry.EmailData> emailList = vCardEntry.getEmailList();
                    if (emailList != null && !emailList.isEmpty()) {
                        mshVar = ((msk) ((uev) useVar.b).a.b()).n(emailList.get(0).getAddress());
                    } else {
                        mshVar = ((msk) ((uev) useVar.b).a.b()).f();
                    }
                }
                uri = ((uev) useVar.b).e.w(null, displayName, mshVar, null);
            }
            uev uevVar = (uev) useVar.b;
            List list = uevVar.c;
            Context context = (Context) uevVar.g.a.b();
            context.getClass();
            uri.getClass();
            list.add(new ufb(context, vCardEntry, uri));
        }
        int size = this.a.size();
        if (size > 1) {
            VCardEntry vCardEntry2 = (VCardEntry) this.a.get(size - 2);
            vCardEntry2.addChild(vCardEntry);
            this.b = vCardEntry2;
        } else {
            this.b = null;
        }
        this.a.remove(size - 1);
    }

    @Override // com.android.vcard.VCardInterpreter
    public final void onEntryStarted() {
        VCardEntry vCardEntry = new VCardEntry(this.d);
        this.b = vCardEntry;
        this.a.add(vCardEntry);
    }

    @Override // com.android.vcard.VCardInterpreter
    public final void onPropertyCreated(VCardProperty vCardProperty) {
        VCardEntry vCardEntry = this.b;
        vCardEntry.getClass();
        vCardEntry.addProperty(vCardProperty);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    @Override // com.android.vcard.VCardInterpreter
    public final void onVCardEnded() {
        for (use useVar : this.c) {
            if (!((uev) useVar.b).c.isEmpty()) {
                uev uevVar = (uev) useVar.b;
                uac uacVar = uevVar.f;
                String m = uevVar.m();
                List list = ((uev) useVar.b).c;
                Context context = (Context) uacVar.b.b();
                context.getClass();
                xnv xnvVar = (xnv) uacVar.a.b();
                xnvVar.getClass();
                m.getClass();
                uevVar.d = new uey(context, xnvVar, m, list);
            }
            ((CountDownLatch) useVar.a).countDown();
        }
    }

    @Override // com.android.vcard.VCardInterpreter
    public final void onVCardStarted() {
        for (use useVar : this.c) {
        }
    }
}
