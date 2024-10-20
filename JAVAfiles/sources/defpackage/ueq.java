package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateMessagePartSizeAction;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ueq extends ugi {
    private final String a;
    private final Uri n;
    private final rgq o;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rgq Oe();
    }

    public ueq(MessagePartCoreData messagePartCoreData) {
        this(messagePartCoreData.Z(), messagePartCoreData.t(), messagePartCoreData.x(), 250, 250, messagePartCoreData.c(), messagePartCoreData.b(), true);
    }

    @Override // defpackage.ugi
    public final Uri a() {
        if (c()) {
            return this.n;
        }
        return this.k;
    }

    @Override // defpackage.ufs
    public final void b(int i, int i2) {
        String str = this.a;
        if (str != null && this.n == null && i != -1 && i2 != -1 && i != this.e && i2 != this.f) {
            new UpdateMessagePartSizeAction(this.o.a, str, i, i2).z();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean c() {
        if (this.k == null && this.n != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ueq(String str, Uri uri, Uri uri2, int i, int i2, int i3, int i4, boolean z) {
        super(uri, i, i2, i3, i4, true, false, false, 0, z);
        this.a = str;
        this.n = uri2;
        this.o = ((a) yyb.aL(a.class)).Oe();
    }
}
