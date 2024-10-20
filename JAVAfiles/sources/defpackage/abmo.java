package defpackage;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abmo {
    public static final aomb a;
    public static final aomd b;

    static {
        Parcelable.Creator creator = ParcelFileDescriptor.CREATOR;
        creator.getClass();
        aomb aombVar = new aomb(new aqup("pfd-keys-bin", new aqxw(creator, false)), new aqsj("REQ-pfd-keys-bin"), new aqsj("RESH-pfd-keys-bin"), new aqsj("REST-pfd-keys-bin"));
        a = aombVar;
        b = new aomd(aombVar);
    }
}
