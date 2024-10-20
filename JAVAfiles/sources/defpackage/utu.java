package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class utu extends acgp {
    private final Context d;
    private final aksr e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public utu(Context context, aksr aksrVar) {
        super(new acgl(context), uvl.i(context));
        aaoc aaocVar = acge.a;
        this.d = context;
        this.e = aksrVar;
    }

    @Override // defpackage.acgp
    protected final void a(Configurations configurations) {
        ArrayList arrayList;
        akrc b = this.e.b("BuglePhenotypeCommitter#handleConfigurations");
        try {
            SharedPreferences.Editor edit = this.d.getSharedPreferences("PhenotypePrefs", 0).edit();
            if (!configurations.f) {
                edit.clear();
            }
            for (Configuration configuration : configurations.d) {
                if (configuration != null) {
                    for (String str : configuration.c) {
                        edit.remove(str);
                    }
                    for (Flag flag : configuration.b) {
                        int i = flag.g;
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        if (i == 5) {
                                            edit.putString(flag.a, Base64.encodeToString(flag.f(), 3));
                                        }
                                    } else {
                                        edit.putString(flag.a, flag.c());
                                    }
                                } else {
                                    edit.putFloat(flag.a, (float) flag.a());
                                }
                            } else {
                                edit.putBoolean(flag.a, flag.e());
                            }
                        } else {
                            edit.putLong(flag.a, flag.b());
                        }
                    }
                }
            }
            edit.putString("__phenotype_server_token", configurations.c);
            edit.putLong("__phenotype_configuration_version", configurations.g);
            edit.putString("__phenotype_snapshot_token", configurations.a);
            if (!edit.commit()) {
                Log.w("PhenotypeFlagCommitter", "Failed to commit Phenotype configs to SharedPreferences!");
            }
            synchronized (uuh.d) {
                arrayList = new ArrayList(uuh.e);
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((uuf) arrayList.get(i2)).l();
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
