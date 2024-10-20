package defpackage;

import android.app.DownloadManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ibr extends xzs {
    public final List a;
    private final Context b;
    private final ydh c;
    private final abbu k;
    private final ibs l;
    private Uri m;
    private Uri n;

    public ibr(Context context, abbu abbuVar, ydh ydhVar, ibs ibsVar, String str) {
        super(str);
        this.a = new ArrayList();
        this.k = abbuVar;
        this.b = context;
        this.c = ydhVar;
        this.l = ibsVar;
    }

    private static boolean f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!gh.t((String) ((grn) it.next()).d)) {
                return true;
            }
        }
        return false;
    }

    private final boolean g() {
        if (this.m != null && this.n != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        boolean z;
        File file;
        Uri uri;
        Uri uri2 = this.m;
        if (uri2 != null && (uri = this.n) != null) {
            ydk.q(this.b, uri2, uri);
            return null;
        }
        if (((Boolean) ibq.a.e()).booleanValue() && !f(this.a)) {
            this.l.c(this.a);
            return null;
        }
        File file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), this.b.getResources().getString(R.string.app_name));
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        Context context = this.b;
        List<grn> list = this.a;
        ContentResolver contentResolver = context.getContentResolver();
        for (grn grnVar : list) {
            Object obj = grnVar.d;
            if (TextUtils.isEmpty(gh.c((String) obj))) {
                String type = contentResolver.getType((Uri) grnVar.a);
                if (true != TextUtils.isEmpty(type)) {
                    obj = type;
                }
            }
            String str = (String) obj;
            if (!gh.m(str) && !gh.z(str)) {
                z = false;
            } else {
                z = true;
            }
            Object obj2 = grnVar.b;
            if (obj2 == null) {
                obj2 = ydh.d((Uri) grnVar.c);
            }
            Context context2 = this.b;
            Object obj3 = grnVar.a;
            if (true != z) {
                file = externalStoragePublicDirectory;
            } else {
                file = file2;
            }
            grnVar.e = ydk.i(context2, (Uri) obj3, file, str, (String) obj2, this.c);
        }
        return null;
    }

    public final void b(Uri uri, String str, Uri uri2, String str2) {
        this.a.add(new grn(uri, str, uri2, str2));
    }

    public final void c(Uri uri, Uri uri2, String str) {
        grn grnVar = new grn(uri, str, (Uri) null, (String) null);
        grnVar.e = uri2;
        this.a.add(grnVar);
        this.m = uri;
        this.n = uri2;
    }

    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        String quantityString;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (grn grnVar : this.a) {
            Object obj2 = grnVar.e;
            if (obj2 == null) {
                i++;
            } else {
                if (!g() && (!((Boolean) ibq.a.e()).booleanValue() || f(this.a))) {
                    Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                    intent.setData((Uri) grnVar.e);
                    this.b.sendBroadcast(intent);
                }
                if (gh.m((String) grnVar.d)) {
                    i3++;
                } else if (gh.z((String) grnVar.d)) {
                    i4++;
                } else if (gh.e((String) grnVar.d)) {
                    i5++;
                } else {
                    i2++;
                    if (g()) {
                        continue;
                    } else {
                        DownloadManager downloadManager = (DownloadManager) this.b.getSystemService("download");
                        String path = ((Uri) obj2).getPath();
                        if (path != null && downloadManager != null) {
                            File file = new File(path);
                            if (file.exists()) {
                                downloadManager.addCompletedDownload(file.getName(), this.b.getString(R.string.attachment_file_description), true, (String) grnVar.d, file.getAbsolutePath(), file.length(), false);
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }
        if (i > 0) {
            quantityString = this.b.getResources().getQuantityString(R.plurals.attachment_save_error, i, Integer.valueOf(i));
        } else {
            int i6 = R.plurals.attachments_saved;
            if (i2 == 0) {
                if (i3 > 0) {
                    i6 = R.plurals.photos_saved_to_folder;
                } else if (i4 > 0) {
                    i6 = R.plurals.videos_saved_to_folder;
                } else if (i5 > 0) {
                    i6 = R.plurals.voice_messages_saved_to_folder;
                }
                i2 = 0;
            }
            int i7 = i3 + i4 + i2 + i5;
            quantityString = this.b.getResources().getQuantityString(i6, i7, Integer.valueOf(i7), this.b.getResources().getString(R.string.app_name));
        }
        this.k.l(quantityString);
    }
}
