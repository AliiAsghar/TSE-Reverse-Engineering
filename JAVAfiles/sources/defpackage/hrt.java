package defpackage;

import android.os.ParcelFileDescriptor;
import com.android.vcard.VCardConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hrt implements hrs {
    private final /* synthetic */ int a;

    public hrt(int i) {
        this.a = i;
    }

    @Override // defpackage.hrs
    public final Class a() {
        if (this.a != 0) {
            return ParcelFileDescriptor.class;
        }
        return InputStream.class;
    }

    @Override // defpackage.hrs
    public final /* synthetic */ Object b(File file) {
        if (this.a != 0) {
            return ParcelFileDescriptor.open(file, VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        }
        return new FileInputStream(file);
    }

    @Override // defpackage.hrs
    public final /* synthetic */ void c(Object obj) {
        if (this.a != 0) {
            ((ParcelFileDescriptor) obj).close();
        } else {
            ((InputStream) obj).close();
        }
    }
}
