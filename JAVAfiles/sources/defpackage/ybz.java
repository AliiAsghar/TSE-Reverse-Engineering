package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ybz {
    public static final xze a = xze.g("Bugle", "VerifiedSmsConstellationDelegateImpl");
    public final Context b;
    public final abqa c;
    public volatile Boolean d;

    public ybz(Context context, abqa abqaVar) {
        this.b = context;
        this.c = abqaVar;
    }

    public final String a() {
        xze xzeVar = a;
        xzeVar.l("Getting certificate hash...");
        try {
            PackageInfo packageInfo = this.b.getPackageManager().getPackageInfo(this.b.getApplicationInfo().packageName, 64);
            if (packageInfo.signatures != null && packageInfo.signatures.length != 0) {
                return amcn.e.j(MessageDigest.getInstance("SHA1").digest(packageInfo.signatures[0].toByteArray()));
            }
            xzeVar.q("Package signatures were not found.");
            return "ABSENT_CERTIFICATE";
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException e) {
            a.n("Error getting certificate hash.", e);
            return "ABSENT_CERTIFICATE";
        }
    }
}
