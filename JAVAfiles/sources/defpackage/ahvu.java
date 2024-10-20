package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ahvu implements alhr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ahvu(Object obj, Object obj2, String str, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = str;
    }

    @Override // defpackage.alhr
    public final Object get() {
        aocr aocrVar;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                Bundle bundle = (Bundle) this.b;
                return ansy.q((String[]) this.c, (Uri) this.a, bundle.getString("android:query-arg-sql-selection"), bundle.getString("android:query-arg-sql-sort-order"));
            }
            int i2 = ambp.a;
            int i3 = ambz.a;
            amby ambyVar = new amby();
            ambyVar.j(((String) this.b).getBytes());
            ambyVar.c((byte) 0);
            ambyVar.j(((String) this.c).getBytes());
            return ((amcn) ((ahiy) this.a).b).j(ambyVar.q().e());
        }
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.a;
        try {
            Object obj4 = ((arrt) obj2).b;
            aocr aocrVar2 = aocs.a;
            if (obj != null) {
                Intent intent = new Intent("com.google.android.build.data.Properties");
                intent.setPackage((String) obj);
                List<ResolveInfo> queryIntentServices = ((PackageManager) obj4).queryIntentServices(intent, 787072);
                if (queryIntentServices.isEmpty()) {
                    aocrVar = aocs.a;
                } else if (queryIntentServices.size() <= 1) {
                    int i4 = queryIntentServices.get(0).serviceInfo.metaData.getInt("com.google.android.build.data.properties");
                    if (i4 == 0) {
                        aocrVar = aocs.a;
                    } else {
                        try {
                            InputStream openRawResource = ((ahvw) obj3).a().openRawResource(i4);
                            aozs aozsVar = aozs.a;
                            apcc apccVar = apcc.a;
                            aocrVar = (aocr) apag.parseFrom(aocr.a, openRawResource, aozs.a);
                        } catch (PackageManager.NameNotFoundException unused) {
                            aocrVar = aocs.a;
                        }
                    }
                } else {
                    throw new IOException("Failed to resolve target AndroidBuildData");
                }
                return Long.valueOf(aocrVar.b);
            }
            throw null;
        } catch (IOException e) {
            Log.e("PhenotypeResourceReader", "Failed to read baseline CL for package ".concat(String.valueOf(obj)), e);
            return -1L;
        }
    }

    public /* synthetic */ ahvu(String[] strArr, Uri uri, Bundle bundle, int i) {
        this.d = i;
        this.c = strArr;
        this.a = uri;
        this.b = bundle;
    }
}
