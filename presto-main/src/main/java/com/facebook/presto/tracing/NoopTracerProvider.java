/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.facebook.presto.tracing;

import com.facebook.presto.spi.tracing.NoopTracer;
import com.facebook.presto.spi.tracing.Tracer;
import com.facebook.presto.spi.tracing.TracerProvider;
import com.google.inject.Inject;

public class NoopTracerProvider
        implements TracerProvider
{
    private static final NoopTracer NOOP_TRACER = new NoopTracer();

    @Inject
    public NoopTracerProvider() {}

    @Override
    public Tracer getNewTracer(boolean isTracingEnabled)
    {
        return NOOP_TRACER;
    }
}
