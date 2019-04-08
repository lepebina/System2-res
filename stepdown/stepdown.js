      $(function(){
        $.plot($("#graph"),
        [
          {label: 'Total scenarios',
           data: [[0,64]] },
          {label: 'Total steps',
           data: [[0,0]] },
          {label: 'Total unused steps',
           data: [[0,0]] }
        ],
        {
          series: {
           lines: { show: true },
           points: { show: true }
          },
          xaxis: {
            ticks: [[0,"8/10"]]
          },
          legend: { position: 'nw' }
        }
        )
        });
