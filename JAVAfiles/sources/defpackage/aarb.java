package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aarb implements aaqh {
    protected static final String[] a = {"1F600", "263A FE0F", "1F60D", "1F602", "1F61B", "1F61E", "1F609", "1F60A", "1F618", "1F601", "2764 FE0F", "1F60F"};
    public List b;
    public boolean c = true;
    public final zxy d;
    private final int e;
    private final aaak f;

    public aarb(Context context, zxy zxyVar, aaak aaakVar) {
        this.e = context.getResources().getInteger(R.integer.c2o_emoji_content_category_max_count);
        this.d = zxyVar;
        this.f = aaakVar;
    }

    @Override // defpackage.aaqh
    public final int a() {
        return this.b.size();
    }

    public final void b(List list) {
        String[] strArr = a;
        int i = this.e;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < Math.min(i, list.size()); i2++) {
            String str = (String) list.get(i2);
            if (this.f.b(str)) {
                arrayList.add(new aarg(str));
            }
        }
        for (int i3 = 0; i3 < 12 && arrayList.size() < i; i3++) {
            String str2 = strArr[i3];
            if (!list.contains(str2)) {
                arrayList.add(new aarg(str2));
            }
        }
        this.b = arrayList;
        this.c = false;
    }
}
