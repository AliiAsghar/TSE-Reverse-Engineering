package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HttpContext;

/* compiled from: PG */
/* loaded from: classes.dex */
interface actj {
    ListenableFuture a(DefaultHttpClient defaultHttpClient, HttpContext httpContext, HttpRequestBase httpRequestBase);

    ListenableFuture b(DefaultHttpClient defaultHttpClient, HttpRequestBase httpRequestBase);
}
